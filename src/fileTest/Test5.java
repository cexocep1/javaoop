package fileTest;

import java.io.*;
/**
 * 使用 输出流 写入字符串到文件中 （效率低   不会乱码）
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		String str = "I love Java 你好";
		File file = new File("test1.txt");
		try {
			// 创建输出流  false 覆盖所有文字
			FileOutputStream fos = new FileOutputStream(file,false);
			// 将字符串 转换成字节数组
			byte[] arr = str.getBytes();
			//写入文件中
			fos.write(arr);
			//关闭流
			fos.close();
			System.out.println("写入成功！");
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}
	}
}
