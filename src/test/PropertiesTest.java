package test;

import com.liu.other.prop.PropertiesUtil;

public class PropertiesTest {
	public static void main(String[] args) {
		try {
			String string = PropertiesUtil.getProperties();
			System.out.println(string);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
