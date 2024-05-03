package com.javatechie.jwt.api.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_invrrheader database table.
 * 
 */
@Entity
@Table(name="tb_invrrheader")
@NamedQuery(name="TbInvrrheader.findAll", query="SELECT t FROM TbInvrrheader t")
public class TbInvrrheader  {
	private static final Long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private Long id;

	public TbInvrrheader() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}