/*
 * @(#)UserRollInfo.java 2014-4-24
 *
 */
package com.ddt.core.meta;

import java.util.Date;

/**
 * UserRollInfo.java
 *
 * @author     <A HREF="mailto:ruan635@163.com">Roy</A>
 * @version    1.0 2014-4-24
 * @since      1.0
 */
public class UserRollInfo {
	
	private long rollBookInfoId;
	
	private long userId;
	
	private Date rollTime;
	
	private String info;
	
	/**
	 * 纬度
	 */
	private double x;
	
	/**
	 * 经度
	 */
	private double y;
	
	/**
	 * 距离
	 */
	private double distance = 100000;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public long getRollBookInfoId() {
		return rollBookInfoId;
	}

	public void setRollBookInfoId(long rollBookInfoId) {
		this.rollBookInfoId = rollBookInfoId;
	}

	public Date getRollTime() {
		return rollTime;
	}

	public void setRollTime(Date rollTime) {
		this.rollTime = rollTime;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
}
