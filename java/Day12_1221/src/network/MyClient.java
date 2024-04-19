package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class MyClient {
	
//	String ipAddress = "192.168.200.82";
	String ipAddress = "172.16.0.61";
	int portNum = 5000;
	
	Socket conn = null;
	BufferedReader br = null;
	
	// ����ȭ
	OutputStream os;
	ObjectOutputStream oos;
	// ������ȭ
	String receiveData;
	InputStream is;
	ObjectInputStream ois;
	
	// ������
	public MyClient() throws IOException {
		System.out.println("***Ŭ���̾�Ʈ ����***");
		try {
			// 1. connection ��û�� �ϴ� �� - session
			conn = new Socket(ipAddress, portNum);
			
			// 2. Ű����κ��� ���۽�ų �����͸� �Է¹޾Ƴ��� ��
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("�Է�--> ");

			// 3. ������ ����
			String sendData = ""; // Object
			os = conn.getOutputStream();
			oos = new ObjectOutputStream(os); // ���� ��Ʈ��
			
			while((sendData=br.readLine())!=null) {
				oos.writeObject(sendData); // ����ȭ
				// ��� ����
				oos.flush();
				if(sendData.equals("quit")) {
					break;
				}
			}
			
			// 4. ���ڼ������� ���۹��� �޽����� ���
			is = conn.getInputStream();
			ois = new ObjectInputStream(is); // ����Ʈ --> Object
			receiveData = (String)ois.readObject();
			System.out.println(conn.getInetAddress() + "�κ��� ���� �޽���: " + receiveData);
			
			// 5. Ŀ�ؼ� ����
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("���ڿ��� ��ȯ�� �� �����ϴ�.");
		} finally {
			if(br!=null) br.close();
			if(oos!=null) oos.close();
			if(os!=null) os.close();
			if(ois!=null) ois.close();
			if(is!=null) is.close();
		}
	}
}
