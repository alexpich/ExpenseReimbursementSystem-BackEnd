package com.alexpich.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "reimbursements")
public class Reimbursement implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "reimbursement_id")
	@NotNull
	private int reimbursementId;

	@Column(name = "amount")
	@NotNull
	private double amount;

	@Column(name = "time_submitted")
	@NotNull
	private Date timeSubmitted;

	@Column(name = "time_resolved")
	@NotNull
	private Date timeResolved;

	@Column(name = "description")
	@NotNull
	private String description;

	@Column(name = "author")
	@NotNull
	private int author;

	@Column(name = "resolver")
	@NotNull
	private int resolver;

	@Column(name = "status_id")
	@NotNull
	private int statusId;

	@Column(name = "type_id")
	@NotNull
	private int typeId;

	public Reimbursement() {
		super();
	}

	public Reimbursement(@NotNull double amount, @NotNull Date timeSubmitted, @NotNull Date timeResolved,
			@NotNull String description, @NotNull int author, @NotNull int resolver, @NotNull int statusId,
			@NotNull int typeId) {
		super();
		this.amount = amount;
		this.timeSubmitted = timeSubmitted;
		this.timeResolved = timeResolved;
		this.description = description;
		this.author = author;
		this.resolver = resolver;
		this.statusId = statusId;
		this.typeId = typeId;
	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getTimeSubmitted() {
		return timeSubmitted;
	}

	public void setTimeSubmitted(Date timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}

	public Date getTimeResolved() {
		return timeResolved;
	}

	public void setTimeResolved(Date timeResolved) {
		this.timeResolved = timeResolved;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAuthor() {
		return author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}

	public int getResolver() {
		return resolver;
	}

	public void setResolver(int resolver) {
		this.resolver = resolver;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + author;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + reimbursementId;
		result = prime * result + resolver;
		result = prime * result + statusId;
		result = prime * result + ((timeResolved == null) ? 0 : timeResolved.hashCode());
		result = prime * result + ((timeSubmitted == null) ? 0 : timeSubmitted.hashCode());
		result = prime * result + typeId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reimbursement other = (Reimbursement) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (author != other.author)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (reimbursementId != other.reimbursementId)
			return false;
		if (resolver != other.resolver)
			return false;
		if (statusId != other.statusId)
			return false;
		if (timeResolved == null) {
			if (other.timeResolved != null)
				return false;
		} else if (!timeResolved.equals(other.timeResolved))
			return false;
		if (timeSubmitted == null) {
			if (other.timeSubmitted != null)
				return false;
		} else if (!timeSubmitted.equals(other.timeSubmitted))
			return false;
		if (typeId != other.typeId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursementId=" + reimbursementId + ", amount=" + amount + ", timeSubmitted="
				+ timeSubmitted + ", timeResolved=" + timeResolved + ", description=" + description + ", author="
				+ author + ", resolver=" + resolver + ", statusId=" + statusId + ", typeId=" + typeId + "]";
	}

}
