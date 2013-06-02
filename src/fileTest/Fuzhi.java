package fileTest;
import java.io.*;
public class Fuzhi {
   public static void main(String[] args) {
	  File file = new File("G:\\javaoop\\20130602191815.gif");
	  File dest = new File("g:\\20130602191815.gif");
	  
	  try {
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(dest);
		if(!dest.exists()){
			dest.createNewFile();
		}
		//字节数组
		byte[] arr = new byte[(int)file.length()];
		fis.read(arr);
		fos.write(arr);
		//关闭流
		fis.close();
		fos.close();
		System.out.println("复制成功");
	} catch (Exception e) {
		System.out.println("文件复制失败！");
		e.printStackTrace();
	}
}
}
