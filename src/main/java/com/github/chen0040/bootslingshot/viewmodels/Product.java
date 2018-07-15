package com.github.chen0040.bootslingshot.viewmodels;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

/**
 * Created by xschen on 24/6/2017.
 */
@Getter
@Setter
public class Product {
	private String error;

	private String tags;

	private String token;

	private String sku;

	private String name;

	private double price;

	private double weight;

	private double rating;

	private String vendor;

	private int status = 0;

	private int visibility = 0;

	private long position;

	private Date createdAt;

	private Date updatedAt; // format 2017-05-03 03:46:13

	private String type;

	private List<String> links = new ArrayList<>();

	private static Random random = new Random();

	private List<Double> prices = new ArrayList<>();

	private Map<String, String> attributes = new HashMap<>();

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public Map<String, String> getAttributes() {
		return attributes;
	}

	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Product() {

	}

	public Product(String vendor, String productName, String sku, double price, double weight,
			Map<String, String> properties, List<Double> pricings, String tags) {
		this.name = productName;
		this.vendor = vendor;
		this.sku = sku;
		this.price = price;
		this.weight = weight;
		this.attributes = properties;
		this.prices = pricings;
		this.rating = random.nextInt(3) + 2;
		this.tags = tags;
	}

	public static Product createAlert(String errorMessage) {
		Product product = new Product();
		return product.alert(errorMessage);
	}

	public Product alert(String errorMessage) {
		error = errorMessage;
		return this;
	}
}
