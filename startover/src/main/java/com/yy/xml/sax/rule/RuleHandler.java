package com.yy.xml.sax.rule;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * <code>RuleHandler<code>
 * <strong></strong>
 * <p>说明：规则解析器
 * <li></li>
 * </p>
 * 
 * @since NC6.5
 * @version 2014年12月3日 上午11:32:14
 * @author tiance
 */
public class RuleHandler extends DefaultHandler implements Constants {

	List<Record> recordList = new LinkedList<Record>();

	List<Field> fieldList;

	private Record record;

	private Field field;

	private static String currentTag;

	/**
	 * 在遇到startElement的时候,一般进行当前tag缓存,对象的创建,tag中的属性的读取
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attrs) throws SAXException {
		currentTag = qName;
		if (qName.equals(FIELD)) {
			field = new Field();
			fieldList.add(field);
			fillAttr(field, attrs);
		} else if (qName.equals(RECORD)) {
			record = new Record();
			recordList.add(record);
			fillAttr(record, attrs);

			fieldList = new ArrayList<Field>();
			record.setFieldList(fieldList);
		}
	}

	/**
	 * 将tag下所有的属性加入到tag对应的对象中
	 * 
	 * @param obj
	 * @param attrs
	 */
	private void fillAttr(Object obj, Attributes attrs) {
		for (int i = 0; i < attrs.getLength(); i++) {
			String key = attrs.getQName(i);
			String value = attrs.getValue(i);

			try {
				java.lang.reflect.Field objField = obj.getClass()
						.getDeclaredField(key);
				objField.setAccessible(true);
				objField.set(obj, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * endElement的时候,一般进行对象的add,将缓存的数据set之类的操作
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		currentTag = null;
	}

	/**
	 * 遇到characters的时候,一般获取数据,将数据set进对象
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if (currentTag == null) {
			return;
		}
		if (currentTag.equals("ufinterface") || currentTag.equals("vars")) {
			return;
		}
		if (currentTag.equals("record") || currentTag.equals("field")) {
			return;
		}

		String value = getContent(ch, start, length);

		try {
			Method method = field.getClass().getDeclaredMethod(
					"set" + currentTag.substring(0, 1).toUpperCase()
							+ currentTag.substring(1), String.class);
			method.invoke(field, value);
		} catch (Exception e) {
			System.out.println("检测到标签" + currentTag + ", 当前record为:" + record
					+ ", 当前field为:" + field);
		}

	}

	/**
	 * 从char数组中获取指定位置,指定长度的字符串
	 * 
	 * @param ch
	 *            整个xml文档的char表示
	 * @param start
	 *            某字符串相对于char[]数组的起始位置
	 * @param length
	 *            某字符串的长度
	 * @return
	 */
	private String getContent(char[] ch, int start, int length) {
		return new String(ch, start, length);
	}

	public List<Record> getRecordList() {
		return recordList;
	}

}
