/**
 * プログラム起動用クラス
 * @author Kazuma Furusawa
 * @version 1.1
 */
import java.io.IOException;


import fishContainers.FishContainers;
import fishContainers.fishContainer.FishContainer;
import fishes.Fishes;
import fishContainers.fishContainer.*;

public class Launcher {

	/**
	 * 起動用メソッド
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//katsuo10.csvの集計結果を出力する
		
		String fileName = "katsuo10.csv";
		Fishes fishes = new Fishes(fileName);
		FishContainers fishContainers = new FishContainers();
		FishContainer fishContainerS = new FishContainer("カツオ", 0, 49);
		FishContainer fishContainerM = new FishContainer("カツオ", 50, 74);
		FishContainer fishContainerL = new FishContainer("カツオ", 75, 100000);
		fishContainers.addFishContainer(fishContainerS);
		fishContainers.addFishContainer(fishContainerM);
		fishContainers.addFishContainer(fishContainerL);
		fishContainers.addFishes(fishes);
		System.out.println(">>inputFile is "+fileName);
		System.out.println(fishContainers.toString());
		
		//katsuo1000.csvの集計結果を出力する
		fileName = "katsuo1000.csv";
		fishes = new Fishes(fileName);
		fishContainers = new FishContainers();
		fishContainerS = new FishContainer("カツオ", 0, 49);
		fishContainerM = new FishContainer("カツオ", 50, 74);
		fishContainerL = new FishContainer("カツオ", 75, 100000);
		fishContainers.addFishContainer(fishContainerS);
		fishContainers.addFishContainer(fishContainerM);
		fishContainers.addFishContainer(fishContainerL);
		fishContainers.addFishes(fishes);
		System.out.println(">>inputFile is "+fileName);
		System.out.println(fishContainers.toString());
		
	}

}
