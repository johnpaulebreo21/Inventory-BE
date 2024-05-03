package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_inv_supplier_items database table.
 * 
 */
@Entity
@Table(name="tb_inv_supplier_items")
@NamedQuery(name="TbInvSupplierItem.findAll", query="SELECT t FROM TbInvSupplierItem t")
public class TbInvSupplierItem  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="item_id")
	private java.math.BigInteger itemId;

	@Column(name="suppier_id")
	private java.math.BigInteger suppierId;

	@Column(name="unit_price", precision=10, scale=2)
	private BigDecimal unitPrice;

	public TbInvSupplierItem() {
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

	public java.math.BigInteger getSuppierId() {
		return this.suppierId;
	}

	public void setSuppierId(java.math.BigInteger suppierId) {
		this.suppierId = suppierId;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}