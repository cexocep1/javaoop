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
		//�ֽ�����
		byte[] arr = new byte[(int)file.length()];
		fis.read(arr);
		fos.write(arr);
		//�ر���
		fis.close();
		fos.close();
		System.out.println("���Ƴɹ�");
	} catch (Exception e) {
		System.out.println("�ļ�����ʧ�ܣ�");
		e.printStackTrace();
	}
}
}
