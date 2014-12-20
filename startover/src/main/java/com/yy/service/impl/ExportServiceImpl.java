package com.yy.service.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.yy.service.ExportService;

public class ExportServiceImpl implements ExportService {

	List<String> testList = new ArrayList<String>();

	private void addValueToList() {
		testList.add("http://www.baidu.com");
		testList.add("http://www.sohu.com");
		testList.add("http://www.sina.com");
		testList.add("www.demandforced3.com");
	}

	private void writeFiles(File target, List<String> imageAddresses)
			throws IOException {
		// TODO LesLie

		// FileOutputStream fileOutputStream = new FileOutputStream(target);
		FileWriter fw = new FileWriter(target);
		for (String s : imageAddresses) {
			fw.write(s + "\n");
			// byte b[] = s.getBytes();
			// fileOutputStream.write(b);
			// fileOutputStream.write("\n".getBytes());
		}
		fw.flush();
		fw.close();
		// fileOutputStream.close();
	}

	public static void main(String[] args) throws IOException {
		ExportServiceImpl e = new ExportServiceImpl();
		e.addValueToList();
		File file = new File("C:/list.txt");
		e.writeFiles(file, e.testList);

	}
}
