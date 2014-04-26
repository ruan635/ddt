/*
 * @(#)RollBook.java 2014-4-19
 *
 */
package com.ddt.core.meta;

import java.util.Date;

/**
 * RollBook.java
 *
 * @author     <A HREF="mailto:ruan635@163.com">Roy</A>
 * @version    1.0 2014-4-19
 * @since      1.0
 */
public class RollBook {
	private long id;
	
	private long userId;
	
	private String name;
	
	private Date validStartTime;
	
	private Date validEndTime;
	
	private Date rollStartTime;
	
	private Date rollEndTime;
	
	private String rollCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getValidStartTime() {
		return validStartTime;
	}

	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

	public Date getValidEndTime() {
		return validEndTime;
	}

	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Date getRollStartTime() {
		return rollStartTime;
	}

	public void setRollStartTime(Date rollStartTime) {
		this.rollStartTime = rollStartTime;
	}

	public Date getRollEndTime() {
		return rollEndTime;
	}

	public void setRollEndTime(Date rollEndTime) {
		this.rollEndTime = rollEndTime;
	}

	public String getRollCode() {
		return rollCode;
	}

	public void setRollCode(String rollCode) {
		this.rollCode = rollCode;
	}
}