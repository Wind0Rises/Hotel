package com.liu.other.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

/**
 * 
 * @author LWA
 * @Descrition 上传工具类
 * @date 2017-8-2 下午6:50:59
 */
public class UploadAndDownloadUtil {
	
	//图片存放的地址
	public static String URL = "image/employee";
	
	//图片名称的头信息
	private static String IMAGE = "image";
	
	public static String uploadInputStream(MultipartFile multipartFile,String url,String fileName) throws Exception{
		File fileUrl = new File(url);
		if (!fileUrl.exists()) {
			fileUrl.mkdirs();
		}
		
		String newFileName =  UploadAndDownloadUtil.imageString(fileName);
		
		File file = new File(url,newFileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		
		InputStream is = multipartFile.getInputStream();
		BufferedInputStream bis = new BufferedInputStream(is);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));
		
		@SuppressWarnings("unused")
		byte[] arr = new byte[1024];
		
		int ch = 0;
		if ((ch = bis.read()) != -1) {
			bos.write(ch);
		}
		
		bos.close();
		bis.close();
		
		multipartFile.transferTo(file);
		
		return newFileName;
	}
	
	
	public static String delete(String url,String fileName){
		File file = new File(url,fileName);
		
		if (!file.exists()) {
			return "暂无相关文件";
		}
		
		file.delete();
		
		return "删除成功";
	}
	
	private static String imageString(String fileName){
		String dateString = String.valueOf(new Date().getTime());
		return  IMAGE + dateString + fileName;
	}
}
