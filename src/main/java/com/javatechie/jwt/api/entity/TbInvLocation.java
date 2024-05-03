package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_inv_location database table.
 * 
 */
@Entity
@Table(name="tb_inv_location")
@NamedQuery(name="TbInvLocation.findAll", query="SELECT t FROM TbInvLocation t")
public class TbInvLocation  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	@Column(name="location_name", length=255)
	private String locationName;

	private byte status;

	public TbInvLocation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

}