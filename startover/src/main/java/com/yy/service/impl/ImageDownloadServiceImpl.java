package com.yy.service.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.lang3.StringUtils;

import com.yy.service.ImageDownloadService;
import com.yy.utils.StreamUtils;

public class ImageDownloadServiceImpl implements ImageDownloadService {
	public static void main(String[] args) {
		// downloadImage(
		// new File("c:\\"),
		// "http://mvnrepository.com/assets/images/392dffac024b9632664e6f2c0cac6fe5-logo.png");
	}

	public boolean downloadImage(File folder, String str) {
		if (StringUtils.isBlank(str)) {
			return false;
		}

		InputStream is = null;
		InputStream bis = null;
		FileOutputStream fos = null;
		try {
			URL url = new URL(str);
			URLConnection connection = url.openConnection();

			String contentType = connection.getContentType();
			int contentLength = connection.getContentLength();

			if (!contentType.startsWith("image/")) {
				System.out.println("Not a image.");
			}
			is = connection.getInputStream();
			bis = new BufferedInputStream(is);

			byte[] imgData = new byte[contentLength];
			int byteRead = 0;
			int offset = 0;
			while (offset < contentLength) {
				byteRead = bis.read(imgData, offset, contentLength);
				if (byteRead == -1) {
					break;
				}
				offset += byteRead;
			}

			if (offset != contentLength) {
				throw new IOException("读取到的文件长度为" + offset + ", 同网站给出的长度"
						+ contentLength + "不一样.");
			}

			String fileName = url.getFile();
			fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
			File imgFile = new File(folder, fileName);
			fos = new FileOutputStream(imgFile);
			fos.write(imgData);
			fos.flush();

			System.out.println();

		} catch (MalformedURLException e) {
			System.out.println("url地址不正确.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			StreamUtils.close(is);
			StreamUtils.close(bis);
			StreamUtils.close(fos);
		}
		return true;
	}

}
