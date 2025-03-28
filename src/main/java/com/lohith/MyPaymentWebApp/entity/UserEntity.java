package com.lohith.MyPaymentWebApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="user_details")
public class UserEntity {
	@Id
	@Column(name="user_id")
	private long userId;
	@Column(name="user_name")
    private String userName;
	@Column(name="password")
    private String password;
	@Column(name="first_name")
    private String firstName;
	@Column(name="last_name")
    private String lastName;
	@Column(name="phone_number")
    private String phoneNumber;
	@Column(name="email")
    private String email;
	@Column(name="address")
    private String address;
}
