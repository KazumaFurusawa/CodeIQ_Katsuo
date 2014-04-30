package fishes.fish;
/**
 * 魚クラス
 * @author Kazuma Furusawa
 * @version 1.1
 */

public class Fish {

	/**
	 * カツオ名
	 */
	String name;
	
	/**
	 * 長さ
	 */
	int length;
	
	/**
	 * デフォルトコンストラクタ
	 * @param name
	 * @param length
	 */
	public Fish(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}
	
	/**
	 * 魚の名前を返す 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 魚の名前をセットする
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 魚の長さを返す
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * 魚の長さをセットする
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * 魚の名前と長さをStringで返す
	 */
	public String toString(){
		return this.name+","+this.length;
	}
	
}
