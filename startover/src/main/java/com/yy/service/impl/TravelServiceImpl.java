package com.yy.service.impl;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.yy.entity.AddressVO;
import com.yy.service.TravelService;
import com.yy.service.common.RegExp;

public class TravelServiceImpl implements TravelService {

	public AddressVO getAddressVO(AddressVO addressVO) throws Exception {
		HttpURLConnection conn = null;
		InputStream inputStream = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url = new URL(addressVO.getRealUrl());
			addressVO.setIp("http://" + url.getHost());

			conn = (HttpURLConnection) url.openConnection();
			String contentType = getContentType(conn);
			inputStream = conn.getInputStream();

			isr = new InputStreamReader(inputStream, contentType);
			br = new BufferedReader(isr);
			analysis(addressVO, br);
		} finally {
			br.close();
			isr.close();
			inputStream.close();
			conn.disconnect();
		}

		return null;
	}

	private String getContentType(HttpURLConnection conn) throws Exception {
		composeConnection(conn);
		String contentType = conn.getContentType();
		return contentType.substring(contentType.lastIndexOf("=") + 1);
	}

	private void composeConnection(HttpURLConnection conn) throws Exception {
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Type", "text/xml");
	}

	private void analysis(AddressVO addressVO, BufferedReader bufferedReader)
			throws Exception {
		RegExp linkRegExp = RegExp.newLinkRegExp();
		RegExp imgRegExp = RegExp.newImgRegExp();

		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
