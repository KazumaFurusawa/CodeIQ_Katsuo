/**
 * �f�[�^�[IO�p�N���X
 * @author Kazuma Furusawa
 * @version 1.1
 */
package io;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import fishes.Fishes;
import fishes.fish.Fish;


public class InputCSV {
	
	/**
	 * �t�@�C��	
	 */
	File file;
	
	/**
	 * �X�g���[���o�C�g�parray
	 */
	byte[] inputByte;
	
	/**
	 * �t�@�C���X�g���[��
	 */
	FileInputStream fileInputStream;
	
	/**
	 * �f�t�H���g�R���X�g���N�^
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public InputCSV(String fileName) throws FileNotFoundException{
		this.file = new File(fileName);
		inputByte = new byte[(int)file.length()];
		fileInputStream = new FileInputStream(file);
	}
	
	/**
	 * �t�@�C����ǂݍ���
	 * @throws IOException
	 */
	public void readFile() throws IOException{
		fileInputStream.read(inputByte);
		fileInputStream.close();
	}
	
	/**
	 * Fishes��Ԃ��B
	 * @param Name
	 * @return Fishes
	 */
	public Fishes toFishes(){
		Fishes fishes = new Fishes();
		String[] strs = this.toArray();
		for(int i =0;i<strs.length;i++){
			String[] kat = strs[i].split(",");
			fishes.addFish(new Fish(kat[0],Integer.valueOf(kat[1].trim())));
		}
		return fishes;
	}
	
	/**
	 * �C���v�b�g����String��String[]�ɕϊ����ĕԂ�
	 * @return splitedString
	 */
	private String[] toArray(){
		String str = new String(inputByte);
		String[] spliteStr = str.split("\n");
		return spliteStr;
	}
	
}
