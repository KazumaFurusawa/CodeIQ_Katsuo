package fishContainers;

/**
 * 魚分別用コンテナ郡クラス
 * @author Kazuma Furusawa
 * @version 1.1
 */
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import fishContainers.fishContainer.FishContainer;
import fishes.Fishes;
import fishes.fish.Fish;

public class FishContainers {

	List<FishContainer> fishContainers;

	/**
	 * デフォルトコンストラクタ
	 * 
	 * @throws IOException
	 */
	public FishContainers() {
		fishContainers = new ArrayList<FishContainer>();
	}

	/**
	 * リストの中の魚を分別して、内蔵されているコンテナに入れる。
	 */
	public void addFishes(Fishes fishes) {
		Iterator<Fish> ite = fishes.Iterator();
		while (ite.hasNext()) {
			Fish fish = ite.next();
			for (int i = 0; i < fishContainers.size(); i++) {
				if (fishContainers.get(i).getName().equals(fish.getName())) {
					if (fishContainers.get(i).getMin() <= fish.getLength()
							&& fishContainers.get(i).getMax() >= fish
									.getLength()) {
						fishContainers.get(i).addFish(fish);
						break;
					}
				}
			}
		}
	}
	
	/**
	 * コンテナを追加する
	 * 
	 * @param fishContainer
	 */
	public void addFishContainer(FishContainer fishContainer) {
		fishContainers.add(fishContainer);
	}
	
	/**
	 * コンテナ別に含まれている魚の名前、魚の量、魚のアベレージをStringで出力する
	 * 
	 */
	public String toString() {
		String str = "";
		Iterator<FishContainer> ite = fishContainers.iterator();
		while (ite.hasNext()) {
			str += ite.next().toString() + "\n";
		}
		return str;
	}


}
