package fishContainers;

/**
 * �����ʗp�R���e�i�S�N���X
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
	 * �f�t�H���g�R���X�g���N�^
	 * 
	 * @throws IOException
	 */
	public FishContainers() {
		fishContainers = new ArrayList<FishContainer>();
	}

	/**
	 * ���X�g�̒��̋��𕪕ʂ��āA��������Ă���R���e�i�ɓ����B
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
	 * �R���e�i��ǉ�����
	 * 
	 * @param fishContainer
	 */
	public void addFishContainer(FishContainer fishContainer) {
		fishContainers.add(fishContainer);
	}
	
	/**
	 * �R���e�i�ʂɊ܂܂�Ă��鋛�̖��O�A���̗ʁA���̃A�x���[�W��String�ŏo�͂���
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
