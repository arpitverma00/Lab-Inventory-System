package com.example.lab.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="request")
public class Request {
	
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long id;
	private Long userId;
	private String name;
	private Long pId;
	
	private int quantity;
	private String status;
	
	public Request() {
		super();
	}
	
	
	
	public Request(Long id, Long userId, String name, Long pId, int quantity, String status) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.pId = pId;
		this.quantity = quantity;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Request [id=" + id + ", userId=" + userId +" , name=" + name +", pId=" +pId + ", quantity=" + quantity + ", status=" + status +"]";
		
	}
	
	

}
