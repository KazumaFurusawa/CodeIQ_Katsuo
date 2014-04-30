package fishContainers.fishContainer;

/**
 * 魚分別用コンテナクラス
 * @author Kazuma Furusawa
 * @version 1.1
 */
import fishes.Fishes;

public class FishContainer extends Fishes {
	private String fishName;
	private int min;
	private int max;

	/**
	 * デフォルトコンストラクター
	 * @param fishName コンテナに入れることのできる魚の種類の名前
	 * @param min コンテナに入れることのできる魚のサイズの下限
	 * @param max コンテナに入れることのできる魚のサイズの上限
	 */
	public FishContainer(String fishName, int min, int max) {
		this.fishName = fishName;
		this.min = min;
		this.max = max;
	}
	
	/**
	 * コンテナにいれることのできる魚の名前を返す
	 * @return
	 */
	public String getName() {
		return this.fishName;
	}
	
	/**
	 * コンテナに入れることのできる魚のサイズの下限を返す
	 * @return
	 */
	public int getMin() {
		return this.min;
	}
	
	/**
	 * コンテナに入れることのできる魚のサイズの上限を返す
	 * @return
	 */
	public int getMax() {
		return this.max;
	}
	
	/**
	 * コンテナに入っている魚の名前、魚の数、長さの平均を返す。
	 */
	@Override
	public String toString() {
		return fishName + "(" + this.size() + ")" + ": "
				+ String.format("%.2f", this.getAvg()) + "cm";

	}
}