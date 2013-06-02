package fileTest;

import java.io.*;

/**
 * 字符流的写入
 * 
 * @author Administrator
 * 
 */
public class Test7 {
	public static void main(String[] args) {
		File file = new File("test2.txt");
		try {
			//创建文件写入流对象 false和默认 都将覆盖所有   true将添加到末尾
			FileWriter fw = new FileWriter(file,true);
			//创建  缓冲区写入流对象
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("亲，你好啊");
			bw.newLine();
			bw.write("恩一点宝吧 ");
			bw.newLine();
			bw.write("byebye");
			bw.close();
			fw.close();
			System.out.println("写入成功！");
		} catch (Exception e) {
			System.out.println("文件操作失败！");
			e.printStackTrace();
		}

	}
}
