package test;

import java.util.Date;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.shiro.crypto.hash.Md5Hash;

import com.liu.movies.GetMessage;

public class DateTest {
	public static void main(String[] args) {
		/*System.out.println(new Md5Hash("zhangsan","zhangsan",2));*/
		/*System.out.println(new Date().getTime());*/
		
		GetMessage getMessage = new GetMessage();
		
		String message = null;
		try {
			message = getMessage.getHour();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(message);
		JSONObject jsonObject = JSONObject.fromObject(message);
		JSONArray jsonArray =  (JSONArray) jsonObject.get("data2");
		for (Object object : jsonArray) {
			JSONObject json = JSONObject.fromObject(object);
			String string = (String)json.get("MovieName");
			System.out.println(string);
		}
		
		
		
		System.out.println(jsonArray);
	}
}
