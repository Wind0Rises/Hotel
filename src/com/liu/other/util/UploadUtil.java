package com.liu.other.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author LWA
 * @Descrition 上传工具类
 * @date 2017-8-2 下午6:50:59
 */
public class UploadUtil {
	
	public static String URL = "image/employee";
	
	public static void uploadInputStream(MultipartFile multipartFile,String url,String fileName) throws Exception{
		File fileUrl = new File(url);
		if (!fileUrl.exists()) {
			fileUrl.mkdirs();
		}
		
		File file = new File(url,fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		InputStream is = multipartFile.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
		
		byte[] arr = new byte[1024];
		
		int ch = 0;
		if ((ch = bis.read()) != -1) {
			bos.write(ch);
		}
		
		bos.close();
		bis.close();
		
		multipartFile.transferTo(file);
		
		
		
	}
	
}
