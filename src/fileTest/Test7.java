package fileTest;

import java.io.*;

/**
 * �ַ�����д��
 * 
 * @author Administrator
 * 
 */
public class Test7 {
	public static void main(String[] args) {
		File file = new File("test2.txt");
		try {
			//�����ļ�д�������� false��Ĭ�� ������������   true����ӵ�ĩβ
			FileWriter fw = new FileWriter(file,true);
			//����  ������д��������
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("�ף���ð�");
			bw.newLine();
			bw.write("��һ�㱦�� ");
			bw.newLine();
			bw.write("byebye");
			bw.close();
			fw.close();
			System.out.println("д��ɹ���");
		} catch (Exception e) {
			System.out.println("�ļ�����ʧ�ܣ�");
			e.printStackTrace();
		}

	}
}
