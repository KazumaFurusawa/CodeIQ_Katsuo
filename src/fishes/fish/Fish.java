package fishes.fish;
/**
 * ���N���X
 * @author Kazuma Furusawa
 * @version 1.1
 */

public class Fish {

	/**
	 * �J�c�I��
	 */
	String name;
	
	/**
	 * ����
	 */
	int length;
	
	/**
	 * �f�t�H���g�R���X�g���N�^
	 * @param name
	 * @param length
	 */
	public Fish(String name, int length) {
		super();
		this.name = name;
		this.length = length;
	}
	
	/**
	 * ���̖��O��Ԃ� 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * ���̖��O���Z�b�g����
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ���̒�����Ԃ�
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	
	/**
	 * ���̒������Z�b�g����
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	/**
	 * ���̖��O�ƒ�����String�ŕԂ�
	 */
	public String toString(){
		return this.name+","+this.length;
	}
	
}
