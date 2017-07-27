package test;

import java.util.Date;

import org.apache.shiro.crypto.hash.Md5Hash;

public class DateTest {
	public static void main(String[] args) {
		/*System.out.println(new Md5Hash("zhangsan","zhangsan",2));*/
		System.out.println(new Date().getTime());
	}
}
