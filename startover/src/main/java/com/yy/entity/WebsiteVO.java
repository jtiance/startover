package com.yy.entity;

/**
 * 
 * Desc: 网站信息
 *
 * @author Sapphire
 *
 * @Since 创建时间:2014年12月7日 下午10:02:09
 */
public class WebsiteVO {
	// 网站地址
	private String ipAddess;
	// 需要下载内容的基本uri
	private String uri;
	// 是否是BBS网站
	private boolean bbs;
	// uri的开始数字
	private int startNum;
	// 包含图片的地址的正则表达式(如果不包含图片,则需要指定此正则表达式)
	private String regExp;

	public String getIpAddess() {
		return ipAddess;
	}

	public void setIpAddess(String ipAddess) {
		this.ipAddess = ipAddess;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public boolean isBbs() {
		return bbs;
	}

	public void setBbs(boolean bbs) {
		this.bbs = bbs;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public String getRegExp() {
		return regExp;
	}

	public void setRegExp(String regExp) {
		this.regExp = regExp;
	}

}
