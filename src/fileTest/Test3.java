package fileTest;

import java.io.*;

/**
 * ʹ���ļ���������ȡ���� �����Զ�ȡ�������� ȱ��Ч�ʵͣ�
 * 
 * @author Administrator
 * 
 */
public class Test3 {
	public static void main(String[] args) {
		//�����ļ�����
		File file = new File("test1.txt");
		try {
			// �����ļ�������
			FileInputStream fis = new FileInputStream(file);
			// ����һ���ֽ�����
			byte[] arr = new byte[(int) file.length()];
			// �����ݶ��뵽������
			fis.read(arr);
			// ���ֽ��������ַ���
			String str = new String(arr);
			System.out.println(str);
			fis.close();
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
}
