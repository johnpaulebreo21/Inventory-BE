package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the tb_inv_master database table.
 * 
 */
@Entity
@Table(name="tb_inv_master")
@NamedQuery(name="TbInvMaster.findAll", query="SELECT t FROM TbInvMaster t")
public class TbInvMaster  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="item_desc", nullable=false, length=255)
	private String itemDesc;

	@Column(name="item_name", nullable=false, length=255)
	private String itemName;

	private byte status;

	@Column(name="unit_price", precision=10, scale=2)
	private BigDecimal unitPrice;

	public TbInvMaster() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItemDesc() {
		return this.itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public BigDecimal getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

}