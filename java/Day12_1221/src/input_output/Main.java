package input_output;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = null;  // main ��Ʈ��
//		FileReader fis = null;
		InputStreamReader isr = null; // ���� ��Ʈ��
		BufferedReader br = null; // ���� ��Ʈ��
		
		try {
			fis = new FileInputStream("test.txt");
//			fis = new FileReader("test.txt");
			isr = new InputStreamReader(fis); // byte -> ���� ���
			br = new BufferedReader(isr); // ���� ��� -> ���۸�
			
//			BufferedReader br = new BufferdReader(new InputStreamReader(new FileInputStream("test.txt")));
			
			String str = ""; // UTF-8
			
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			
			/*
			int ch = 0;
			
			while((ch = fis.read()) != -1) {
				System.out.print((char)ch);
//				System.out.write(ch);
			}
			*/
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			System.out.println("������ ���Դϴ�.");
		} finally {
			if(br!=null) {
				br.close();
			}
			if(isr!=null) {
				isr.close();
			}
			if(fis != null) {
				fis.close();
			}
		}
	}

}
