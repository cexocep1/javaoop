package fileTest;

import java.io.*;
/**
 * ʹ���ļ���������ȡ����(�˷�ʽ�ò������ģ�����)
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		File file = new File("test1.txt");
		try {
			//�����ļ�������
			FileInputStream fis = new FileInputStream(file);
			for (int i = 0; i < file.length(); i++) {
				char ch = (char) fis.read();
				System.out.print(ch);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}

	}
}
