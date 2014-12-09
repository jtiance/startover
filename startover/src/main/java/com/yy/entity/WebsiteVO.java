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
	// 是否包含索引号
	private boolean hasIndex;
	// 是否包含图片
	private boolean hasImage;
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

	public boolean isHasIndex() {
		return hasIndex;
	}

	public void setHasIndex(boolean hasIndex) {
		this.hasIndex = hasIndex;
	}

	public boolean isHasImage() {
		return hasImage;
	}

	public void setHasImage(boolean hasImage) {
		this.hasImage = hasImage;
	}

	public String getRegExp() {
		return regExp;
	}

	public void setRegExp(String regExp) {
		this.regExp = regExp;
	}

}
