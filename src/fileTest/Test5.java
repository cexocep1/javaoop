package fileTest;

import java.io.*;
/**
 * ʹ�� ����� д���ַ������ļ��� ��Ч�ʵ�   �������룩
 * @author Administrator
 *
 */
public class Test5 {
	public static void main(String[] args) {
		String str = "I love Java ���";
		File file = new File("test1.txt");
		try {
			// ���������  false ������������
			FileOutputStream fos = new FileOutputStream(file,false);
			// ���ַ��� ת�����ֽ�����
			byte[] arr = str.getBytes();
			//д���ļ���
			fos.write(arr);
			//�ر���
			fos.close();
			System.out.println("д��ɹ���");
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
}
