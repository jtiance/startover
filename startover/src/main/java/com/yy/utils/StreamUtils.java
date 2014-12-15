package com.yy.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 关闭数据流
 * 
 * @author Administrator
 *
 */
public class StreamUtils {
	public static void close(InputStream is) {
		try {
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(OutputStream os) {
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
