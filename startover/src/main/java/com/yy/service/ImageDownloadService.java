package com.yy.service;

import java.io.File;

/**
 * 图片下载的接口
 * 
 * @author Sapphire
 *
 */
public interface ImageDownloadService {
	public boolean downloadImage(File folder, String str);
}
