package com.capgemini.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "Slots")
public class Slots implements Serializable {
	@Id
	@Column(name = "Slot_id")
	private Integer slot_id;
	@Column(name = "Slot_status")
	private String slot_status;
	@Column(name = "Slot_booking_time")
	private String slot_booking_time;
	@Column(name = "Slot_place")
	private String slot_place;
	@Column(name = "Slot_booking_date")
	private String slot_booking_date;
	public Integer getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(Integer slot_id) {
		this.slot_id = slot_id;
	}
	public String getSlot_status() {
		return slot_status;
	}
	public void setSlot_status(String slot_status) {
		this.slot_status = slot_status;
	}
	public String getSlot_booking_time() {
		return slot_booking_time;
	}
	public void setSlot_booking_time(String slot_booking_time) {
		this.slot_booking_time = slot_booking_time;
	}
	public String getSlot_place() {
		return slot_place;
	}
	public void setSlot_place(String slot_place) {
		this.slot_place = slot_place;
	}
	public String getSlot_booking_date() {
		return slot_booking_date;
	}
	public void setSlot_booking_date(String slot_booking_date) {
		this.slot_booking_date = slot_booking_date;
	}
	@Override
	public String toString() {
		return "Slots [slot_id=" + slot_id + ", slot_status=" + slot_status + ", slot_booking_time=" + slot_booking_time
				+ ", slot_place=" + slot_place + ", slot_booking_date=" + slot_booking_date + "]";
	}
	
	

}
