package fishes;
/**
 * 魚群クラス
 * @author Kazuma Furusawa
 * @version 1.1
 */

import io.InputCSV;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import fishes.fish.Fish;


public class Fishes {
	private ArrayList<Fish> fishList;
	
	/**
	 * デフォルトコンストラクター
	 * @param the name;
	 */
	public Fishes() {
		fishList = new ArrayList<Fish>();
	}
	
	/**
	 * CSVファイルを読み込み、自身に登録する。
	 * @param fileName
	 * @throws IOException
	 */
	public Fishes(String fileName) throws IOException{
		fishList = new ArrayList<Fish>();
		this.inputCSV(fileName);
	}
	
	/**
	 * 魚を自身に追加する
	 * @param Fish
	 * @return 
	 */
	public void addFish(Fish fish) {
		fishList.add(fish);
	}
	
	/**
	 * 平均を返す
	 * @return length average of the list
	 */
	public double getAvg() {
		if(getSum()!=0){
			double calc = (double) getSum() / (double) size();
			return new BigDecimal(calc).setScale(2, BigDecimal.ROUND_HALF_UP)
					.doubleValue();
		}
		return 0;
	}
	
	/**
	 * 合計を返す
	 * @return sum of the list
	 */
	private int getSum() {
		int sum = 0;
		Iterator<Fish> katI = fishList.iterator();
		while (katI.hasNext()) {
			sum += katI.next().getLength();
		}
		return sum;
	}
	
	/**
	 * サイズを返す
	 * @return size of the list
	 */
	public int size() {
		return fishList.size();
	}
	
	/**
	 * indexの位置にある魚を参照する。
	 * @param index
	 * @return Fish
	 */
	public Fish getFish(int index) {
		return fishList.get(index);
	}
	
	/**
	 * iteratorを返す
	 * @return iterator
	 */
	public Iterator<Fish> Iterator() {
		return fishList.iterator();
	}
	
	/**
	 * CSVファイルから魚達を取り込み、自身に登録する
	 * @param fileName
	 * @throws IOException
	 */
	private void inputCSV(String fileName) throws IOException{
		InputCSV input = new InputCSV(fileName);
		input.readFile();
		Iterator<Fish> ite = input.toFishes().Iterator();
		while(ite.hasNext()){
			this.fishList.add((Fish)ite.next());
		}
	}

	/**
	 * 魚の数、平均をStringで返す。
	 */
	@Override
	public String toString() {
		return "(" + fishList.size() + ")" + ": "
				+ String.format("%.2f", getAvg()) + "cm";

	}
}
