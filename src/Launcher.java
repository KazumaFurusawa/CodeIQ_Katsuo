/**
 * �v���O�����N���p�N���X
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
	 * �N���p���\�b�h
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//katsuo10.csv�̏W�v���ʂ��o�͂���
		
		String fileName = "katsuo10.csv";
		Fishes fishes = new Fishes(fileName);
		FishContainers fishContainers = new FishContainers();
		FishContainer fishContainerS = new FishContainer("�J�c�I", 0, 49);
		FishContainer fishContainerM = new FishContainer("�J�c�I", 50, 74);
		FishContainer fishContainerL = new FishContainer("�J�c�I", 75, 100000);
		fishContainers.addFishContainer(fishContainerS);
		fishContainers.addFishContainer(fishContainerM);
		fishContainers.addFishContainer(fishContainerL);
		fishContainers.addFishes(fishes);
		System.out.println(">>inputFile is "+fileName);
		System.out.println(fishContainers.toString());
		
		//katsuo1000.csv�̏W�v���ʂ��o�͂���
		fileName = "katsuo1000.csv";
		fishes = new Fishes(fileName);
		fishContainers = new FishContainers();
		fishContainerS = new FishContainer("�J�c�I", 0, 49);
		fishContainerM = new FishContainer("�J�c�I", 50, 74);
		fishContainerL = new FishContainer("�J�c�I", 75, 100000);
		fishContainers.addFishContainer(fishContainerS);
		fishContainers.addFishContainer(fishContainerM);
		fishContainers.addFishContainer(fishContainerL);
		fishContainers.addFishes(fishes);
		System.out.println(">>inputFile is "+fileName);
		System.out.println(fishContainers.toString());
		
	}

}
