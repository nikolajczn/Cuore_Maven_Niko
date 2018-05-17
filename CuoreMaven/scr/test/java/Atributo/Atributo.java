package Atributo;

import java.util.List;

public class Atributo {

	private String id;
	private static String name;
	private String description;
	private AttributeValueType attributeValueType;
	private AttributeFormat attributeFormat;
	private String status = "true";
	private List<String> options;
	private boolean applyAsset;
	private boolean systemAttribute;
	private String level;
	private String entity;
	private String key;
	
	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}
	
	public static String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}
	
	public AttributeValueType getattributeValueType() {
		AttributeValueType attributeValueType = new AttributeValueType();
    	this.attributeValueType = attributeValueType;
		return attributeValueType;
	}

    public void setattributeValueType() {
    	this.attributeValueType = attributeValueType;
	}
	
	public AttributeFormat getattributeFormat() {
		AttributeFormat attributeFormat = new AttributeFormat();
    	this.attributeFormat = attributeFormat;
		return attributeFormat;
	}

    public void setattributeFormat() {
    	this.attributeFormat = attributeFormat;
	}
    
	public String getstatus() {
		return status;
	}

	public void setstatus() {
		this.status = status;
	}
	
	public List<String> getoptions() {
		return options;
	}

	public void setoptions() {
		this.options = options;
	}
    
	public boolean getapplyAsset() {
		return applyAsset;
	}

	public void setapplyAsset(boolean applyAsset) {
		this.applyAsset = applyAsset;
	}
	
	public boolean getsystemAttribute() {
		return systemAttribute;
	}

	public void setsystemAttribute(boolean systemAttribute) {
		this.systemAttribute = systemAttribute;
	}
    
	public String getlevel() {
		return level;
	}

	public void setlevel(String level) {
		this.level = level;
	}
	
	public String getentity() {
		return entity;
	}

	public void setentity() {
		this.entity = entity;
	}
	
	public String getkey() {
		return key;
	}

	public void setkey() {
		this.key = key;
	}
	
}
