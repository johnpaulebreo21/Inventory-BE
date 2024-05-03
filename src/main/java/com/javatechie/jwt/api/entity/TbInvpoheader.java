package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_invpoheader database table.
 * 
 */
@Entity
@Table(name="tb_invpoheader")
@NamedQuery(name="TbInvpoheader.findAll", query="SELECT t FROM TbInvpoheader t")
public class TbInvpoheader  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="supplier_id")
	private java.math.BigInteger supplierId;

	public TbInvpoheader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.math.BigInteger getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(java.math.BigInteger supplierId) {
		this.supplierId = supplierId;
	}

}