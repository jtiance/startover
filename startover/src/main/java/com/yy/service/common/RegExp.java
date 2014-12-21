package com.yy.service.common;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
	private Pattern p;

	private static final String PATTERN_LINK = "<a\\shref=(\"|)(.+?)>";

	// TODO 只匹配固定集中图片
	private static final String PATTERN_IMG = "<img\\ssrc=(\"|)(.+?)\\.(png|jpg|jpeg|gif)(.*?)>";

	private RegExp() {

	}

	private RegExp(String regex) {
		p = Pattern.compile(regex);
	}

	public static RegExp newLinkRegExp() {
		return new RegExp(PATTERN_LINK);
	}

	public static RegExp newImgRegExp() {
		return new RegExp(PATTERN_IMG);
	}

	/**
	 * 从给定字符串中找到符合规则的字符串并返回
	 * 
	 * @param tobe
	 * @return
	 */
	public List<String> getMatches(String tobe) {
		boolean matches = true;
		List<String> groups = new ArrayList<String>();
		while (matches) {
			Matcher m = p.matcher(tobe);
			if (matches = m.find()) {
				String str = m.group();
				groups.add(str);
				tobe = tobe.replace(str, "");
			}
		}

		return groups;
	}

	public static void main(String[] args) {
		// RegExp e = RegExp.newLinkRegExp();
		RegExp e = RegExp.newImgRegExp();
		e.getMatches("<img src=\"http://pejnya.ru/files/b1000000.gif\" alt=\"\" />fdfds<img src=\"http://pejnya.ru/files/b10007000.gif\" alt=\"\" />");
	}
}
