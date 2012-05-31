package com.jshop.entity;

// Generated 2012-5-31 15:44:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * FavoriteT generated by hbm2java
 */
public class FavoriteT implements java.io.Serializable {

	private String favoriteid;
	private String title;
	private String goodsid;
	private String tag;
	private String descript;
	private String userid;
	private String state;
	private Date addtime;
	private Integer readcount;
	private String memberprice;

	public FavoriteT() {
	}

	public FavoriteT(String favoriteid, String title, String userid,
			String state, Date addtime) {
		this.favoriteid = favoriteid;
		this.title = title;
		this.userid = userid;
		this.state = state;
		this.addtime = addtime;
	}

	public FavoriteT(String favoriteid, String title, String goodsid,
			String tag, String descript, String userid, String state,
			Date addtime, Integer readcount, String memberprice) {
		this.favoriteid = favoriteid;
		this.title = title;
		this.goodsid = goodsid;
		this.tag = tag;
		this.descript = descript;
		this.userid = userid;
		this.state = state;
		this.addtime = addtime;
		this.readcount = readcount;
		this.memberprice = memberprice;
	}

	public String getFavoriteid() {
		return this.favoriteid;
	}

	public void setFavoriteid(String favoriteid) {
		this.favoriteid = favoriteid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Integer getReadcount() {
		return this.readcount;
	}

	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}

	public String getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(String memberprice) {
		this.memberprice = memberprice;
	}

}