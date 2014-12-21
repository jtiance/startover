package com.yy.entity;

/**
 * 
 * Desc: web路径信息
 *
 * @author Sapphire
 *
 * @Since 创建时间:2014年12月7日 下午10:02:09
 */
public class AddressVO {

	public static final String REPLACEMENT = "[REPLACEMENT]";
	// 域或ip
	protected String ip;
	// 网址
	protected String url;
	// 需要下载内容的基本的key
	protected String replacement;
	// 是否是BBS网站
	protected boolean bbs;
	// uri的开始数字
	protected int startNum;
	// 包含图片的地址的正则表达式(如果不包含图片,则需要指定此正则表达式)
	protected String regExp;
	// 是否为包含address的address
	protected boolean hasImage;

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getReplacement() {
		return replacement;
	}

	public void setReplacement(String replacement) {
		this.replacement = replacement;
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

	public boolean isHasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

	public String getRealUrl() {
		return this.url.replace(REPLACEMENT, replacement);
	}

}
