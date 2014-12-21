package com.yy.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressWithAddressVO extends AddressVO {

	public AddressWithAddressVO() {
		super.hasImage = false;
	}

	private List<AddressVO> addressVOs;

	public List<AddressVO> getAddressVOs() {
		return addressVOs;
	}

	public void setAddressVOs(List<AddressVO> addressVOs) {
		this.addressVOs = addressVOs;
	}

	public void addAddressVO(AddressVO addressVO) {
		if (addressVOs == null) {
			addressVOs = new ArrayList<AddressVO>();
		}
		addressVOs.add(addressVO);
	}

	@Override
	public String toString() {
		return "路径集合";
	}

}
