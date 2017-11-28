package com.dredis.bn.model;

import java.io.Serializable;

public class Bok implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4111292834377304970L;
	
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bok(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Bok() {
	}
}
