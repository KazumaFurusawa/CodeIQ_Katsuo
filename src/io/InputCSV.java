/**
 * データーIO用クラス
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
	 * ファイル	
	 */
	File file;
	
	/**
	 * ストリームバイト用array
	 */
	byte[] inputByte;
	
	/**
	 * ファイルストリーム
	 */
	FileInputStream fileInputStream;
	
	/**
	 * デフォルトコンストラクタ
	 * @param fileName
	 * @throws FileNotFoundException
	 */
	public InputCSV(String fileName) throws FileNotFoundException{
		this.file = new File(fileName);
		inputByte = new byte[(int)file.length()];
		fileInputStream = new FileInputStream(file);
	}
	
	/**
	 * ファイルを読み込む
	 * @throws IOException
	 */
	public void readFile() throws IOException{
		fileInputStream.read(inputByte);
		fileInputStream.close();
	}
	
	/**
	 * Fishesを返す。
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
	 * インプットしたStringをString[]に変換して返す
	 * @return splitedString
	 */
	private String[] toArray(){
		String str = new String(inputByte);
		String[] spliteStr = str.split("\n");
		return spliteStr;
	}
	
}
