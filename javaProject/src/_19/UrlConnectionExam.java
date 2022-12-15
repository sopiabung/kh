package _19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	//프로그램 <== 원격컴퓨터의 리소스(InputStream)
	//프로그램 ==> 원격컴퓨터의 리소스(OutputStream)
	//1.원격컴퓨터에 접속
	//2.스트림 생성
	//3.입출력

	public static void main(String[] args) {
		URL url=null;
		try {
			url =new URL("http://google.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			if(conn != null) {
				conn.setConnectTimeout(3000);
				StringBuilder sb = new StringBuilder();
				//정상적으로 처리된 경우
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
					while (true) {
						String line = br.readLine();
						if(line == null) break;
						sb.append(line+"\r\n");
					}
					br.close();
				}
				conn.disconnect();
				System.out.println(sb);
			}
		} catch ( Exception e) {
			e.printStackTrace();
		}
	}
}
