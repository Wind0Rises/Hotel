package test;

import org.apache.shiro.crypto.hash.Md5Hash;

public class Md5 {
	public static void main(String[] args) {
		
		String password = "zhangsan";
		
		String solat = "liu";
		
		int number = 3;

		Md5Hash s = new Md5Hash(password,solat,number);
		
		System.out.println(s.toString());
	}
}
