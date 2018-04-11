package com.gelaigelai.domain;

/**
 * AbstractFunId entity provides the base persistence definition of the FunId
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFunId implements java.io.Serializable {

	// Fields

	private Integer fromUserId;
	private Integer toUserId;
	private Integer bothStatus;

	// Constructors

	/** default constructor */
	public AbstractFunId() {
	}

	/** full constructor */
	public AbstractFunId(Integer fromUserId, Integer toUserId,
			Integer bothStatus) {
		this.fromUserId = fromUserId;
		this.toUserId = toUserId;
		this.bothStatus = bothStatus;
	}

	// Property accessors

	public Integer getFromUserId() {
		return this.fromUserId;
	}

	public void setFromUserId(Integer fromUserId) {
		this.fromUserId = fromUserId;
	}

	public Integer getToUserId() {
		return this.toUserId;
	}

	public void setToUserId(Integer toUserId) {
		this.toUserId = toUserId;
	}

	public Integer getBothStatus() {
		return this.bothStatus;
	}

	public void setBothStatus(Integer bothStatus) {
		this.bothStatus = bothStatus;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFunId))
			return false;
		AbstractFunId castOther = (AbstractFunId) other;

		return ((this.getFromUserId() == castOther.getFromUserId()) || (this
				.getFromUserId() != null && castOther.getFromUserId() != null && this
				.getFromUserId().equals(castOther.getFromUserId())))
				&& ((this.getToUserId() == castOther.getToUserId()) || (this
						.getToUserId() != null
						&& castOther.getToUserId() != null && this
						.getToUserId().equals(castOther.getToUserId())))
				&& ((this.getBothStatus() == castOther.getBothStatus()) || (this
						.getBothStatus() != null
						&& castOther.getBothStatus() != null && this
						.getBothStatus().equals(castOther.getBothStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFromUserId() == null ? 0 : this.getFromUserId()
						.hashCode());
		result = 37 * result
				+ (getToUserId() == null ? 0 : this.getToUserId().hashCode());
		result = 37
				* result
				+ (getBothStatus() == null ? 0 : this.getBothStatus()
						.hashCode());
		return result;
	}

}