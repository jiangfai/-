package com.qfedu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

/**
 * 部门
 * @author 骆昊
 * @version 1.0
 * @created 15-七月-2017 上午11:23:03
 */
@Entity
@Table(name = "tbdept")
public class Department {
	@Id
	@Column(name = "deptno")
	@DecimalMin("10")
	@DecimalMax("99")
	private Integer no;
	@Column(name = "dname")
	@Pattern(regexp = ".{3,10}")
	private String name;
	@Column(name = "dloc")
	@Length(min = 2, max = 10)
	private String location;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}