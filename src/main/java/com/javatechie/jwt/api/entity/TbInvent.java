package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_invent database table.
 * 
 */
@Entity
@Table(name="tb_invent")
@NamedQuery(name="TbInvent.findAll", query="SELECT t FROM TbInvent t")
public class TbInvent  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="item_id")
	private java.math.BigInteger itemId;

	@Column(name="location_id")
	private java.math.BigInteger locationId;

	@Column(precision=10, scale=2)
	private BigDecimal quantity;

	public TbInvent() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.math.BigInteger getItemId() {
		return this.itemId;
	}

	public void setItemId(java.math.BigInteger itemId) {
		this.itemId = itemId;
	}

	public java.math.BigInteger getLocationId() {
		return this.locationId;
	}

	public void setLocationId(java.math.BigInteger locationId) {
		this.locationId = locationId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

}