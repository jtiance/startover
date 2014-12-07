package com.yy.entity;

import java.io.InputStream;

/**
 * 
 * Desc: 用于保存图片对象
 *
 * @author Sapphire
 *
 * @Since 创建时间:2014年12月7日 下午9:30:32
 */
public class ImageVO {
	// 图片地址
	private String url;
	// 图片地址是否为绝对路径,绝对路径带有IP,相对路径不带IP
	private boolean isObsolute;
	// 图片所属的网址
	private String ipAddress;
	// 图片的数据流(下载之后才有)
	private InputStream io;
	// 图片存放位置
	private String folder;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isObsolute() {
		return isObsolute;
	}

	public void setObsolute(boolean isObsolute) {
		this.isObsolute = isObsolute;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public InputStream getIo() {
		return io;
	}

	public void setIo(InputStream io) {
		this.io = io;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

}
