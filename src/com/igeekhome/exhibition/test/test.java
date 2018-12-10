package com.igeekhome.exhibition.test;

import com.igeekhome.exhibition.util.MD5Util;

public class test {

	public static void main(String[] args) {
		String s= MD5Util.getMD5("admin");
      System.out.println(s);
	}

}
