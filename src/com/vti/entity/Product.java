package com.vti.entity;

/**
 * @author Admin
 *
 */
public class Product {
	private int id;
	private String name;
	private String price;
	private String infor;
	private String detail;
	private int ratingStar;
	private String productImageName;
	private Manufacturer manufacturer;
	private Category category;
	
	public Product() {

	}

	public Product(int id, String name, String price, String infor, String detail, int ratingStar, String productImageName,
			Manufacturer manufacturer, Category category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.infor = infor;
		this.detail = detail;
		this.ratingStar = ratingStar;
		this.productImageName = productImageName;
		this.manufacturer = manufacturer;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getInfor() {
		return infor;
	}

	public void setInfor(String infor) {
		this.infor = infor;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getRatingStar() {
		return ratingStar;
	}

	public void setRatingStar(int ratingStar) {
		this.ratingStar = ratingStar;
	}

	public String getProductImageName() {
		return productImageName;
	}

	public void setProductImageName(String productImageName) {
		this.productImageName = productImageName;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", infor=" + infor + ", detail=" + detail
				+ ", ratingStar=" + ratingStar + ", productImageName=" + productImageName + ", manufacturer="
				+ manufacturer + ", category=" + category + "]";
	}
	
}
