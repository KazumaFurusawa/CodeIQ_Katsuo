package fishContainers.fishContainer;

/**
 * �����ʗp�R���e�i�N���X
 * @author Kazuma Furusawa
 * @version 1.1
 */
import fishes.Fishes;

public class FishContainer extends Fishes {
	private String fishName;
	private int min;
	private int max;

	/**
	 * �f�t�H���g�R���X�g���N�^�[
	 * @param fishName �R���e�i�ɓ���邱�Ƃ̂ł��鋛�̎�ނ̖��O
	 * @param min �R���e�i�ɓ���邱�Ƃ̂ł��鋛�̃T�C�Y�̉���
	 * @param max �R���e�i�ɓ���邱�Ƃ̂ł��鋛�̃T�C�Y�̏��
	 */
	public FishContainer(String fishName, int min, int max) {
		this.fishName = fishName;
		this.min = min;
		this.max = max;
	}
	
	/**
	 * �R���e�i�ɂ���邱�Ƃ̂ł��鋛�̖��O��Ԃ�
	 * @return
	 */
	public String getName() {
		return this.fishName;
	}
	
	/**
	 * �R���e�i�ɓ���邱�Ƃ̂ł��鋛�̃T�C�Y�̉�����Ԃ�
	 * @return
	 */
	public int getMin() {
		return this.min;
	}
	
	/**
	 * �R���e�i�ɓ���邱�Ƃ̂ł��鋛�̃T�C�Y�̏����Ԃ�
	 * @return
	 */
	public int getMax() {
		return this.max;
	}
	
	/**
	 * �R���e�i�ɓ����Ă��鋛�̖��O�A���̐��A�����̕��ς�Ԃ��B
	 */
	@Override
	public String toString() {
		return fishName + "(" + this.size() + ")" + ": "
				+ String.format("%.2f", this.getAvg()) + "cm";

	}
}