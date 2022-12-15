package _19;

import java.net.InetAddress;

public class InetAddressExam {

	public static void main(String[] args) {
		try {
			InetAddress	address = InetAddress.getByName("google.com");
			System.out.println(address);
			System.out.println(address.getHostName());//호스트이름(도메인이름)
			System.out.println(address.getHostAddress());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
