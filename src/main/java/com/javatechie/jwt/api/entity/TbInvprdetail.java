package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_invprdetails database table.
 * 
 */
@Entity
@Table(name="tb_invprdetails")
@NamedQuery(name="TbInvprdetail.findAll", query="SELECT t FROM TbInvprdetail t")
public class TbInvprdetail  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="item_id")
	private java.math.BigInteger itemId;

	@Column(name="prheader_id")
	private java.math.BigInteger prheaderId;

	@Column(precision=10, scale=2)
	private BigDecimal quantity;

	public TbInvprdetail() {
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

}