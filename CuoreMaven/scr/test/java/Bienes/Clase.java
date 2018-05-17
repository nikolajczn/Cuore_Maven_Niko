package Bienes;

import java.util.List;


public class Clase {

	private String id;
	private String name;
	private String description;
	private List<String> elements;
	private String children;
	private String status = "Alta";
	private String parent;
	private String brand;
	private String code;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}
	
	public String getdescription() {
		return description;
	}

	public void setdesciption(String desciption) {
		this.description = desciption;
	}
	
	public List<String> getelements() {
		return elements;
	}

	public void setelements() {
		this.elements = elements;
	}
	
	public String getchildren() {
		return children;
	}

	public void setchildren() {
		this.children = children;
	}
	
	public String getstatus() {
		return status;
	}

	public void setstatus() {
		this.status = status;
	}
	
	public String getparent() {
		return parent;
	}

	public void setparent() {
		this.parent = parent;
	}
	
	public String getbrand() {
		return brand;
	}

	public void setbrand() {
		this.brand = brand;
	}
	
	public String getcode() {
		return code;
	}

	public void setcode() {
		this.code = code;
	}
	
}


