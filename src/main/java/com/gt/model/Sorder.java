package com.gt.model;
// Generated 2015-10-11 20:55:41 by Hibernate Tools 4.0.0



/**
 * Sorder generated by hbm2java
 */
public class Sorder implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7003708334893781345L;
	private Integer id;
	private String name;
	private Double price;
	private Integer number;
	private Product product;
	private Integer bid;

	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}


	public Integer getBid() {
		return this.bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

}
