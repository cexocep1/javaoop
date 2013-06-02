package fileTest;

import java.io.*;
/**
 * 使用文件输入流读取数据(此方式得不到中文，乱码)
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		File file = new File("test1.txt");
		try {
			//创建文件输入流
			FileInputStream fis = new FileInputStream(file);
			for (int i = 0; i < file.length(); i++) {
				char ch = (char) fis.read();
				System.out.print(ch);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}

	}
}
