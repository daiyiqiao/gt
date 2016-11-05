package com.gt.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.commons.codec.binary.Base64;
import org.tukaani.xz.LZMA2Options;
import org.tukaani.xz.XZInputStream;
import org.tukaani.xz.XZOutputStream;



public class HttpRequestor {

	public static String sendPost(String url, String param) {
		String result = "";// 返回的结果
		BufferedReader in = null;// 读取响应输入流
		PrintWriter out = null;
		XZOutputStream xz = null;
		try {
			// 编码请求参数
			String name = "name";
			String psd = "password";
			String put = name+":"+psd;
			String str = Base64.encodeBase64String(put.getBytes());
			// 创建URL对象
			java.net.URL connURL = new java.net.URL(url);
			// 打开URL连接
			java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL.openConnection();
			// 设置通用属性
			httpConn.setRequestProperty("Accept", "*/*");
			httpConn.setRequestProperty("Connection", "Keep-Alive");
			httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
			httpConn.setRequestProperty("Authorization", str);
			// 设置POST方式
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);

			// 获取HttpURLConnection对象对应的输出流		
			xz = new XZOutputStream(httpConn.getOutputStream(), new LZMA2Options(6));
			xz.write(param.getBytes("utf-8"));
			xz.flush();
			XZInputStream xzis = new XZInputStream(httpConn.getInputStream());
			in = new BufferedReader(new InputStreamReader(xzis));
			// 读取返回的内容
			String line;
			// 读取返回的内容
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
				if (xz != null) {
					xz.close();
				}

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
}
