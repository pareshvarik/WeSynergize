package com.capgemini.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Electric_point")
public class Electric_point implements Serializable {
	@Id
	@Column(name = "Point_name")
	private Integer point_name;
	@Column(name = "Slot_status")
	private String slot_status;
	public Integer getPoint_name() {
		return point_name;
	}
	public void setPoint_name(Integer point_name) {
		this.point_name = point_name;
	}
	public String getSlot_status() {
		return slot_status;
	}
	public void setSlot_status(String slot_status) {
		this.slot_status = slot_status;
	}
	@Override
	public String toString() {
		return "Electric_point [point_name=" + point_name + ", slot_status=" + slot_status + "]";
	}
	
}
