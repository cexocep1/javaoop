package fileTest;

import java.io.*;

/**
 * ʹ��д���� ���ַ���д�뵽�ļ��� ���������룩
 * 
 * @author Administrator
 * 
 */
public class Test4 {
	public static void main(String[] args) {
		File file = new File("test1.txt");
		String str = "���ñ��Ե�׼����haha";

		try {
			// ����д���� �ڶ������� дtrue ��ӵ�ĩβ дfalse��д Ĭ�ϸ���ԭ���ļ�
			FileOutputStream fos = new FileOutputStream(file, true);
			// ѭ���ַ����ĳ��� ��һ��һ���ֽڵ�д�뵽�ļ���
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				fos.write(ch);
			}
			// �ر���
			fos.close();
			System.out.println("д��ɹ�");
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}
	}

}
