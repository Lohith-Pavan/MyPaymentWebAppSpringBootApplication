package com.lohith.MyPaymentWebApp.entity;

import java.time.LocalDate;

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
@Table(name = "user_account_details")
public class UserAccountDetailsEntity {
	@Id
	@Column(name = "user_account_id")
	private long userAccId;
	@Column(name = "user_id")
	private long userId;
	@Column(name = "account_open_date")
	private LocalDate accOpenDate;
	@Column(name = "current_wallet_balance")
	private int linkedBankAccsCount;
	@Column(name = "wallet_pin")
	private double walletPin;
}
