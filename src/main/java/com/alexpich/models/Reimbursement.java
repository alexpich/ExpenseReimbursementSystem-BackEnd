package com.alexpich.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "reimbursements")
public class Reimbursement implements Serializable {

	private static final long serialVersionUID = 1L;

}
