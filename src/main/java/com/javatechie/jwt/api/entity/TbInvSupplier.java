package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_inv_supplier database table.
 * 
 */
@Entity
@Table(name="tb_inv_supplier")
@NamedQuery(name="TbInvSupplier.findAll", query="SELECT t FROM TbInvSupplier t")
public class TbInvSupplier  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	private byte status;

	@Column(name="supplier_address", length=255)
	private String supplierAddress;

	@Column(name="supplier_name", length=255)
	private String supplierName;

	public TbInvSupplier() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getSupplierAddress() {
		return this.supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}