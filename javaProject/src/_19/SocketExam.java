package _19;

import java.net.ServerSocket;

public class SocketExam {
	public static void main(String[] args) {
		ServerSocket socket = null;
		for(int i=0; i<=65535; i++) {
			try {
				socket = new ServerSocket(i);
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");
			}
		}
		System.out.println("포트 검사를 마쳤습니다.");
	}
}
