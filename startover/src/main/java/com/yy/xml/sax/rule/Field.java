package com.yy.xml.sax.rule;

public class Field {
	private String desc;

	private String matchtag;

	private String name;

	private String type;

	private Boolean nullallowed;

	private Integer maxLength;

	private Boolean needexport;

	private Boolean checkTranslatedPK;

	private String basdoc;

	private String translator;

	private String variablename;

	private String translatorParams;

	private String defaultvalue;

	private String enumid;

	private String refitem;

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getMatchtag() {
		return matchtag;
	}

	public void setMatchtag(String matchtag) {
		this.matchtag = matchtag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getNullallowed() {
		return nullallowed;
	}

	public void setNullallowed(String nullallowed) {
		if (nullallowed == null || nullallowed.length() == 0)
			return;
		this.nullallowed = nullallowed.equalsIgnoreCase("yes") ? true : false;
	}

	public Integer getMaxLength() {
		return maxLength;
	}

	public void setMaxLength(String maxLength) {
		if (maxLength == null || maxLength.length() == 0)
			return;

		this.maxLength = Integer.valueOf(maxLength);
	}

	public Boolean getNeedexport() {
		return needexport;
	}

	public void setNeedexport(String needexport) {

		if (needexport == null || needexport.length() == 0)
			return;
		this.needexport = needexport.equalsIgnoreCase("yes") ? true : false;
	}

	public Boolean getCheckTranslatedPK() {
		return checkTranslatedPK;
	}

	public void setCheckTranslatedPK(String checkTranslatedPK) {
		if (checkTranslatedPK == null || checkTranslatedPK.length() == 0)
			return;
		this.checkTranslatedPK = checkTranslatedPK.equalsIgnoreCase("yes") ? true
				: false;
	}

	public String getBasdoc() {
		return basdoc;
	}

	public void setBasdoc(String basdoc) {
		this.basdoc = basdoc;
	}

	public String getTranslator() {
		return translator;
	}

	public void setTranslator(String translator) {
		this.translator = translator;
	}

	public String getVariablename() {
		return variablename;
	}

	public void setVariablename(String variablename) {
		this.variablename = variablename;
	}

	public String getTranslatorParams() {
		return translatorParams;
	}

	public void setTranslatorParams(String translatorParams) {
		this.translatorParams = translatorParams;
	}

	public String getDefaultvalue() {
		return defaultvalue;
	}

	public void setDefaultvalue(String defaultvalue) {
		this.defaultvalue = defaultvalue;
	}

	public String getEnumid() {
		return enumid;
	}

	public void setEnumid(String enumid) {
		this.enumid = enumid;
	}

	public String getRefitem() {
		return refitem;
	}

	public void setRefitem(String refitem) {
		this.refitem = refitem;
	}

	@Override
	public String toString() {
		return this.getName() + "(" + this.getDesc() + ")";
	}

}
