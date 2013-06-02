package fileTest;

import java.io.*;

/**
 * 使用写入流 将字符串写入到文件中 （中文乱码）
 * 
 * @author Administrator
 * 
 */
public class Test4 {
	public static void main(String[] args) {
		File file = new File("test1.txt");
		String str = "做好被吭的准备！haha";

		try {
			// 创建写入流 第二个参数 写true 添加到末尾 写false或不写 默认覆盖原有文件
			FileOutputStream fos = new FileOutputStream(file, true);
			// 循环字符串的长度 将一个一个字节的写入到文件中
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				fos.write(ch);
			}
			// 关闭流
			fos.close();
			System.out.println("写入成功");
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}
	}

}
