package fishes;
/**
 * ���Q�N���X
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
	 * �f�t�H���g�R���X�g���N�^�[
	 * @param the name;
	 */
	public Fishes() {
		fishList = new ArrayList<Fish>();
	}
	
	/**
	 * CSV�t�@�C����ǂݍ��݁A���g�ɓo�^����B
	 * @param fileName
	 * @throws IOException
	 */
	public Fishes(String fileName) throws IOException{
		fishList = new ArrayList<Fish>();
		this.inputCSV(fileName);
	}
	
	/**
	 * �������g�ɒǉ�����
	 * @param Fish
	 * @return 
	 */
	public void addFish(Fish fish) {
		fishList.add(fish);
	}
	
	/**
	 * ���ς�Ԃ�
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
	 * ���v��Ԃ�
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
	 * �T�C�Y��Ԃ�
	 * @return size of the list
	 */
	public int size() {
		return fishList.size();
	}
	
	/**
	 * index�̈ʒu�ɂ��鋛���Q�Ƃ���B
	 * @param index
	 * @return Fish
	 */
	public Fish getFish(int index) {
		return fishList.get(index);
	}
	
	/**
	 * iterator��Ԃ�
	 * @return iterator
	 */
	public Iterator<Fish> Iterator() {
		return fishList.iterator();
	}
	
	/**
	 * CSV�t�@�C�����狛�B����荞�݁A���g�ɓo�^����
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
	 * ���̐��A���ς�String�ŕԂ��B
	 */
	@Override
	public String toString() {
		return "(" + fishList.size() + ")" + ": "
				+ String.format("%.2f", getAvg()) + "cm";

	}
}
