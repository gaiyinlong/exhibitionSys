package com.igeekhome.exhibition.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

/**
 * @company 无锡极客营	
 * @author 极客营
 * @description 
 * 2017年2月17日
 */
public class TimeUtil {
	
	public static int readInt(HttpServletRequest req,String paramName){
		int result = 0;
		try {
			result = Integer.parseInt(req.getParameter(paramName));
		} catch (Exception e) {

		}
		return result;
	}
	
	public static String getNow(){
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
}
