package _19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws MalformedURLException {
		String website = "https://pds.joongang.co.kr/news/component/htmlphoto_mmdata/202212/12/caf70266-7f14-451f-90da-815caa5fe6ae.jpg";
		System.out.println("다운로드를 시작합니다.");
		URL url=new URL(website);
		byte[] buffer = new byte[2048];
		//try~with문 (java1.7부터 도입)
		//finally가 없어도 리소스를 자동으로 종료시킴
		//try(리소스선언부){
		//}catch(Exception e){
		//}
		try (InputStream in=url.openStream(); 
				OutputStream out=new FileOutputStream("c:\\test\\test.jpg")){
			int length= 0;
			while ((length=in.read(buffer)) != -1) {
				System.out.println(length+"바이트 읽음.");
				out.write(buffer,0,length);
			}
			System.out.println("다운로드가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
