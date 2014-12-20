package com.yy.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressWithImageVO extends AddressVO {

	public AddressWithImageVO() {
		super.isAddressWithAddressVO = false;
	}

	private String name;

	private List<ImageVO> imageVOs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setImages(List<ImageVO> images) {
		this.imageVOs = images;
	}

	public List<ImageVO> getImages() {
		return imageVOs;
	}

	public void addImageVO(ImageVO imageVO) {
		if (imageVOs == null) {
			imageVOs = new ArrayList<ImageVO>();
		}
		imageVOs.add(imageVO);
	}

	public int getImageSize() {
		return imageVOs.size();
	}

	@Override
	public String toString() {
		return name;
	}

}
