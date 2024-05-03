package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_invrrdetails database table.
 * 
 */
@Entity
@Table(name="tb_invrrdetails")
@NamedQuery(name="TbInvrrdetail.findAll", query="SELECT t FROM TbInvrrdetail t")
public class TbInvrrdetail  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="item_id")
	private java.math.BigInteger itemId;

	@Column(name="poheader_id")
	private java.math.BigInteger poheaderId;

	@Column(name="prheader_id")
	private java.math.BigInteger prheaderId;

	@Column(precision=10, scale=2)
	private BigDecimal quantity;

	@Column(name="rrheader_id")
	private java.math.BigInteger rrheaderId;

	@Column(name="unit_price", precision=10, scale=2)
	private BigDecimal unitPrice;

	public TbInvrrdetail() {
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

	public java.math.BigInteger getPoheaderId() {
		return this.poheaderId;
	}

	public void setPoheaderId(java.math.BigInteger poheaderId) {
		this.poheaderId = poheaderId;
	}

	public java.math.BigInteger getPrheaderId() {
		return this.prheaderId;
	}

	public void setPrheaderId(java.math.BigInteger prheaderId) {
		this.prheaderId = prheaderId;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public java.math.BigInteger getRrheaderId() {
		return this.rrheaderId;
	}

	public void setRrheaderId(java.math.BigInteger rrheaderId) {
		this.rrheaderId = rrheaderId;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}