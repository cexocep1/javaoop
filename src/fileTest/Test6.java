package fileTest;

import java.io.*;

/**
 * 文件的复制
 * 
 * @author Administrator
 * 
 */
public class Test6 {
	public static void main(String[] args) {
		//源文件对象
		File file = new File("test1.txt");
		//新目标文件
		File dest = new File("test2.txt");
		try {
			// 创建文件输入流
			FileInputStream fis = new FileInputStream(file);
			// 创建文件输出流
			FileOutputStream fos = new FileOutputStream(dest);
			// 判断文件是否存在
			if (!dest.exists()) {
				// 如果文件不存在就新创建一个
				dest.createNewFile();
			}
			// 字节数组
			byte[] arr = new byte[(int) file.length()];
			// 从输入流将数据读入到字节数组中
			fis.read(arr);
			// 将数据写入到输出流中
			fos.write(arr);
			// 关闭资源
			fis.close();
			fos.close();
			System.out.println("复制成功！");
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}
	}
}
