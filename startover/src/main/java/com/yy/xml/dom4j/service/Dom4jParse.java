package com.yy.xml.dom4j.service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.yy.xml.dom4j.bean.Person;

public class Dom4jParse {

	public static void main(String[] args) throws Exception {
		SAXReader reader = new SAXReader();
		InputStream is = ClassLoader.getSystemResourceAsStream("people.xml");
		Document document = reader.read(is);

		Element root = document.getRootElement();
		System.out.println("��ڵ㣺 " + root.getName());

		Element childNode = null;
		Element node = null;

		List<Person> list = new ArrayList<Person>();

		for (Iterator<Element> i = root.elementIterator(); i.hasNext();) {
			childNode = (Element) i.next();
			//System.out.println();
			// System.out.println("ֱϵ�ӽڵ㣺" + childNode.getName());
			Attribute attr = childNode.attribute("name");

			Person p = new Person();
			//System.out.println("����: " + attr.getValue());
			p.setName(attr.getValue());

			for (Iterator<Element> iter = childNode.elementIterator(); iter.hasNext();) {
				node = (Element) iter.next();
				// System.out.println(node.getName());
				if (node.getName().equals("gender")) {
					p.setGender(node.getText());
					//System.out.println("�Ա�:" + node.getText());
				}else if (node.getName().equals("task")) {
					p.setTask(Integer.parseInt(node.getText()));
					//System.out.println("����:" + node.getText());
				}
			}
			list.add(p);
		}
		System.out.println("================");
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
