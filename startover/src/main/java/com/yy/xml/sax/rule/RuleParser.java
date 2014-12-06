package com.yy.xml.sax.rule;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

/**
 * <code>RuleParser<code>
 * <strong></strong>
 * <p>说明：xml解析的起点
 * <li></li>
 * </p>
 * 
 * @since NC6.5
 * @version 2014年12月3日 上午11:34:06
 * @author tiance
 */
public class RuleParser {
	// 待处理的xml的位置
	private String sourceXml = "0_material.xml";

	// 生成的数据的位置
	private File targetFolder = new File("xml");

	public static void main(String[] args) throws Exception {
		RuleParser parser = new RuleParser();
		List<Record> ruleList = parser.parseXMLFile();

		parser.sortAndGet(ruleList);
	}

	/**
	 * 对列表进行特殊排序
	 * 
	 * @param list
	 */
	private Record sortAndGet(List<Record> list) {
		// TODO
		return null;
	}

	/**
	 * <p>
	 * 说明：解析文档的入口
	 * <li></li>
	 * </p>
	 * 
	 * @return
	 * @throws Exception
	 * @date 2014年12月3日 上午11:33:35
	 * @since NC6.5
	 */
	private List<Record> parseXMLFile() throws Exception {
		sourceXml = RuleParser.class.getPackage().getName()
				.replaceAll("\\.", "/")
				+ "/" + sourceXml;
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		InputStream is = RuleParser.class.getClassLoader().getResourceAsStream(
				sourceXml);
		RuleHandler handler = new RuleHandler();
		saxParser.parse(is, handler);
		is.close();
		return handler.getRecordList();
	}
}
