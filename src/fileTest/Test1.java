package fileTest;

import java.io.*;
/**
 * ʹ���ַ���������ȡ�ļ����ݲ����
 * @author Administrator
 *
 */
public class Test1 {
	public static void main(String[] args) {
		//�����ļ�����
       File file = new  File("test1.txt");
       try {
    	   //����������
		FileReader fr = new  FileReader(file);
		//���������Ŷ�ȡ����
		char[] arr = new char[1024];
		//�õ�����ĳ���
		int length = fr.read(arr);
		//�����ַ��� ��������е�����
		String str = new String(arr, 0, length);
		System.out.println(str);
		//�ر���
		fr.close();
       }catch(Exception e){
    	   System.out.println("�ļ�����ʧ�ܣ�");
    	    e.printStackTrace();
       }
       
       
	}
}
