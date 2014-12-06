package com.yy.xml.sax.rule;

import java.util.List;

public class Record {
	private String classname;

	private String displayName;

	private String entitytag;

	private String stabletag;

	private String metadataid;

	private String recordtype;

	private String sentitytag;

	private String tablename;

	private String tabletype;

	private String typeName;

	private String tabletag;

	private List<Field> fieldList;

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEntitytag() {
		return entitytag;
	}

	public void setEntitytag(String entitytag) {
		this.entitytag = entitytag;
	}

	public String getStabletag() {
		return stabletag;
	}

	public void setStabletag(String stabletag) {
		this.stabletag = stabletag;
	}

	public String getMetadataid() {
		return metadataid;
	}

	public void setMetadataid(String metadataid) {
		this.metadataid = metadataid;
	}

	public String getRecordtype() {
		return recordtype;
	}

	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}

	public String getSentitytag() {
		return sentitytag;
	}

	public void setSentitytag(String sentitytag) {
		this.sentitytag = sentitytag;
	}

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getTabletype() {
		return tabletype;
	}

	public void setTabletype(String tabletype) {
		this.tabletype = tabletype;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTabletag() {
		return tabletag;
	}

	public void setTabletag(String tabletag) {
		this.tabletag = tabletag;
	}

	public List<Field> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<Field> fieldList) {
		this.fieldList = fieldList;
	}

	@Override
	public String toString() {
		return this.getTablename() + "(" + this.getDisplayName() + ")";
	}

}
