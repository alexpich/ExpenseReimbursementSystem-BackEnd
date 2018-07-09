package com.alexpich.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "users")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;

	@Column(name = "username")
	@NotNull
	private String username;

	@Column(name = "password")
	@NotNull
	private String password;

	@Column(name = "firstname")
	@NotNull
	private String firstName;

	@Column(name = "lastname")
	@NotNull
	private String lastName;

	@Column(name = "email")
	@NotNull
	private String email;

	@Column(name = "role_id")
	@NotNull
	@Min(1)
	@Max(2)
	private int roleId;

	@Column(name = "role_type")
	@NotNull
	private String roleType;

	public User(@NotNull String username, @NotNull String password, @NotNull String firstName, @NotNull String lastName,
			@NotNull String email, @NotNull @Min(1) @Max(2) int roleId, @NotNull String roleType) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roleId = roleId;
		this.roleType = roleType;
	}

	public User(Long userId, @NotNull String username, @NotNull String password, @NotNull String firstName,
			@NotNull String lastName, @NotNull String email, @NotNull @Min(1) @Max(2) int roleId,
			@NotNull String roleType) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roleId = roleId;
		this.roleType = roleType;
	}

}
