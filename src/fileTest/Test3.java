package fileTest;

import java.io.*;

/**
 * 使用文件输入流读取数据 （可以读取所有数据 缺点效率低）
 * 
 * @author Administrator
 * 
 */
public class Test3 {
	public static void main(String[] args) {
		//创建文件对象
		File file = new File("test1.txt");
		try {
			// 创建文件输入流
			FileInputStream fis = new FileInputStream(file);
			// 创建一个字节数组
			byte[] arr = new byte[(int) file.length()];
			// 将数据读入到数组中
			fis.read(arr);
			// 将字节数组变成字符串
			String str = new String(arr);
			System.out.println(str);
			fis.close();
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}
	}
}
