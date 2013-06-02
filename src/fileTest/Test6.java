package fileTest;

import java.io.*;

/**
 * �ļ��ĸ���
 * 
 * @author Administrator
 * 
 */
public class Test6 {
	public static void main(String[] args) {
		//Դ�ļ�����
		File file = new File("test1.txt");
		//��Ŀ���ļ�
		File dest = new File("test2.txt");
		try {
			// �����ļ�������
			FileInputStream fis = new FileInputStream(file);
			// �����ļ������
			FileOutputStream fos = new FileOutputStream(dest);
			// �ж��ļ��Ƿ����
			if (!dest.exists()) {
				// ����ļ������ھ��´���һ��
				dest.createNewFile();
			}
			// �ֽ�����
			byte[] arr = new byte[(int) file.length()];
			// �������������ݶ��뵽�ֽ�������
			fis.read(arr);
			// ������д�뵽�������
			fos.write(arr);
			// �ر���Դ
			fis.close();
			fos.close();
			System.out.println("���Ƴɹ���");
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}
	}
}
