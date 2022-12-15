package _19;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//서버용 프로그램(먼저 실행)
public class DataServer {
	public static void main(String[] args) throws Exception{
		try (ServerSocket ss = new ServerSocket(8000)){
			System.out.println("서비스가 시작되었습니다.");
			while (true) {
				Socket socket = ss.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
				String str = sdf.format(new Date());
				out.println(true);
				socket.close();//연결종료
			}
		} catch (Exception e) {

		}
	}
}
