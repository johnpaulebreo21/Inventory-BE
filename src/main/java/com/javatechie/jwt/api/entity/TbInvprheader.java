package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_invprheader database table.
 * 
 */
@Entity
@Table(name="tb_invprheader")
@NamedQuery(name="TbInvprheader.findAll", query="SELECT t FROM TbInvprheader t")
public class TbInvprheader  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	public TbInvprheader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}