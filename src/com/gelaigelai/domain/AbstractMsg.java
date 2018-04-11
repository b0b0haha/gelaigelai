package com.gelaigelai.domain;

import java.util.Date;

/**
 * AbstractMsg entity provides the base persistence definition of the Msg
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMsg implements java.io.Serializable {

	// Fields

	private Integer idMsg;
	private Date msgTime;
	private Integer msgFrom;
	private Integer msgTo;
	private String msgInfo;

	// Constructors

	/** default constructor */
	public AbstractMsg() {
	}

	/** full constructor */
	public AbstractMsg(Date msgTime, Integer msgFrom, Integer msgTo,
			String msgInfo) {
		this.msgTime = msgTime;
		this.msgFrom = msgFrom;
		this.msgTo = msgTo;
		this.msgInfo = msgInfo;
	}

	// Property accessors

	public Integer getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(Integer idMsg) {
		this.idMsg = idMsg;
	}

	public Date getMsgTime() {
		return this.msgTime;
	}

	public void setMsgTime(Date msgTime) {
		this.msgTime = msgTime;
	}

	public Integer getMsgFrom() {
		return this.msgFrom;
	}

	public void setMsgFrom(Integer msgFrom) {
		this.msgFrom = msgFrom;
	}

	public Integer getMsgTo() {
		return this.msgTo;
	}

	public void setMsgTo(Integer msgTo) {
		this.msgTo = msgTo;
	}

	public String getMsgInfo() {
		return this.msgInfo;
	}

	public void setMsgInfo(String msgInfo) {
		this.msgInfo = msgInfo;
	}

}