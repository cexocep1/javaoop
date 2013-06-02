package fileTest;

import java.io.*;
/**
 * 使用字符输入流读取文件内容并输出
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//创建文件对象
       File file = new  File("test1.txt");
       try {
    	   //创建输入流
		FileReader fr = new  FileReader(file);
		//创建数组存放读取内容
		char[] arr = new char[1024];
		//得到数组的长度
		int length = fr.read(arr);
		//声明字符串 输出数组中的内容
		String str = new String(arr, 0, length);
		System.out.println(str);
		//关闭流
		fr.close();
       }catch(Exception e){
    	   System.out.println("文件操作失败！");
    	    e.printStackTrace();
       }
       
       
	}
}
