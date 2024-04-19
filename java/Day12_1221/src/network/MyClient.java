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
	
	// 직렬화
	OutputStream os;
	ObjectOutputStream oos;
	// 역직렬화
	String receiveData;
	InputStream is;
	ObjectInputStream ois;
	
	// 생성자
	public MyClient() throws IOException {
		System.out.println("***클라이언트 실행***");
		try {
			// 1. connection 요청을 하는 것 - session
			conn = new Socket(ipAddress, portNum);
			
			// 2. 키보드로부터 전송시킬 데이터를 입력받아놓는 것
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력--> ");

			// 3. 데이터 전송
			String sendData = ""; // Object
			os = conn.getOutputStream();
			oos = new ObjectOutputStream(os); // 보조 스트림
			
			while((sendData=br.readLine())!=null) {
				oos.writeObject(sendData); // 직렬화
				// 출력 버퍼
				oos.flush();
				if(sendData.equals("quit")) {
					break;
				}
			}
			
			// 4. 에코서버에서 전송받은 메시지를 출력
			is = conn.getInputStream();
			ois = new ObjectInputStream(is); // 바이트 --> Object
			receiveData = (String)ois.readObject();
			System.out.println(conn.getInetAddress() + "로부터 받은 메시지: " + receiveData);
			
			// 5. 커넥션 해제
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("문자열로 변환할 수 없습니다.");
		} finally {
			if(br!=null) br.close();
			if(oos!=null) oos.close();
			if(os!=null) os.close();
			if(ois!=null) ois.close();
			if(is!=null) is.close();
		}
	}
}
