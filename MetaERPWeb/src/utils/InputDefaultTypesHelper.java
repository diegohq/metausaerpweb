package utils;

import metaerp.InputDefaultTypes;

public enum InputDefaultTypesHelper {
	
	VARCHAR(InputDefaultTypes.VARCHAR, "VARCHAR(255)", "input", "Max. 255 characters", "text", "maxlength=\"255\""),
	TEXT(InputDefaultTypes.TEXT, "TEXT", "textarea", ""),
	INT(InputDefaultTypes.INT, "INT(11)", "input", "Comma as thousand separator", "text", "maxlength=\"11\" data-metaerp-mask=\"int\" data-metaerp-validation=\"^[0-9]{0,3}(,[0-9]{3})*$\"", "0"),
	DECIMAL(InputDefaultTypes.DECIMAL, "DECIMAL(12,2)", "input", "Comma as thousand separator and dot as decimal separator", "text", "maxlength=\"12\" data-metaerp-mask=\"decimal\" data-metaerp-validation=\"^[0-9]{0,3}(,[0-9]{3})*(\\.[0-9]{2})?$\"", "0.00"),
	PASSWORD(InputDefaultTypes.PASSWORD, "VARCHAR(255)", "input", "", "password", "maxlength=\"255\""),
	DATE(InputDefaultTypes.DATE, "varchar(255)", "input", "MM/DD/YYYY", "text", "data-metaerp-mask=\"date\" data-metaerp-validation=\"^(0[1-9]|1[0-2])/((0[1-9])|([1-2][0-9])|(3[0-1]))/[0-9]{4}$\""),
	DATETIME(InputDefaultTypes.DATETIME, "varchar(255)", "MM/DD/YYYY HH:MM:SS", "input", "text", "data-metaerp-mask=\"datetime\" data-metaerp-validation=\"^(0[1-9]|1[0-2])/((0[1-9])|([1-2][0-9])|(3[0-1]))/[0-9]{4} (([0-1][0-9])|(2[0-3]))(:[0-5][0-9]){2}$\"");
	
	private InputDefaultTypes inputDefaultTypes;
	private String sqlType;
	private String htmlTag;
	private boolean htmlTagClose;
	private String htmlType;
	private String extra;
	private String helpText;
	private String defaultValue;
	
	private InputDefaultTypesHelper(InputDefaultTypes inputDefaultTypes, String sqlType, String htmlTag, String helpText) {
		this(inputDefaultTypes, sqlType, htmlTag, helpText, "", "", "");
	}
	
	private InputDefaultTypesHelper(InputDefaultTypes inputDefaultTypes, String sqlType, String htmlTag, String helpText, String htmlType) {
		this(inputDefaultTypes, sqlType, htmlTag, helpText, htmlType, "", "");
	}

	private InputDefaultTypesHelper(InputDefaultTypes inputDefaultTypes, String sqlType, String htmlTag, String helpText, String htmlType, String extra) {
		this(inputDefaultTypes, sqlType, htmlTag, helpText, htmlType, extra, "");
	}
	
	private InputDefaultTypesHelper(InputDefaultTypes inputDefaultTypes, String sqlType, String htmlTag, String helpText, String htmlType, String extra, String defaultValue) {
		setInputDefaultTypes(inputDefaultTypes);
		setSqlType(sqlType);
		setHtmlTag(htmlTag);
		setHelpText(helpText);
		setHtmlType(htmlType);
		setExtra(extra);
		setDefaultValue(defaultValue);
		
		if(htmlTag == "textarea") {
			setHtmlTagClose(true);
		} else {
			setHtmlTagClose(false);
		}
		
	}
	
	public static InputDefaultTypesHelper getByInputDefaultTypesValue(int value) {
		
		switch(value) {
			case InputDefaultTypes.VARCHAR_VALUE: return VARCHAR;
			case InputDefaultTypes.TEXT_VALUE: return TEXT;
			case InputDefaultTypes.PASSWORD_VALUE: return PASSWORD;
			case InputDefaultTypes.INT_VALUE: return INT;
			case InputDefaultTypes.DECIMAL_VALUE: return DECIMAL;
			case InputDefaultTypes.DATE_VALUE: return DATE;
			case InputDefaultTypes.DATETIME_VALUE: return DATETIME;
			default: return null;
		}
				
	}
	
	/*
	 * GETTERS AND SETTERS
	 */

	public InputDefaultTypes getInputDefaultTypes() {
		return inputDefaultTypes;
	}

	private void setInputDefaultTypes(InputDefaultTypes inputDefaultTypes) {
		this.inputDefaultTypes = inputDefaultTypes;
	}
	
	public String getSqlType() {
		return sqlType;
	}

	private void setSqlType(String sqlType) {
		this.sqlType = sqlType;
	}

	public String getHtmlTag() {
		return htmlTag;
	}

	private void setHtmlTag(String htmlTag) {
		this.htmlTag = htmlTag;
	}

	public String getHtmlType() {
		return htmlType;
	}

	private void setHtmlType(String htmlType) {
		this.htmlType = htmlType;
	}

	public String getExtra() {
		return extra;
	}

	private void setExtra(String extra) {
		this.extra = extra;
	}

	public boolean isHtmlTagClose() {
		return htmlTagClose;
	}

	private void setHtmlTagClose(boolean htmlTagClose) {
		this.htmlTagClose = htmlTagClose;
	}

	public String getHelpText() {
		return helpText;
	}

	private void setHelpText(String helpText) {
		this.helpText = helpText;
	}
	

	public String getDefaultValue() {
		return defaultValue;
	}

	private void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

}
