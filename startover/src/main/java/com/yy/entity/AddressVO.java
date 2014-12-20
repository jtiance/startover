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
	// 网站地址
	protected String ipAddess;
	// 需要下载内容的基本uri
	protected String uri;
	// 是否是BBS网站
	protected boolean bbs;
	// uri的开始数字
	protected int startNum;
	// 包含图片的地址的正则表达式(如果不包含图片,则需要指定此正则表达式)
	protected String regExp;
	// 是否为包含address的address
	protected boolean isAddressWithAddressVO;

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

	public boolean isAddressWithAddressVO() {
		return isAddressWithAddressVO;
	}

	public void setAddressWithAddressVO(boolean isAddressWithAddressVO) {
		this.isAddressWithAddressVO = isAddressWithAddressVO;
	}
}
