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
@Table(name="bank_accounts")
public class BankAccountsEntity {
	@Id
    @Column(name="bank_account_id")
    private long bankAccId;
	@Column(name="user_id")
	private long userId;
	@Column(name="account_number")
	private long accountNumber;
	@Column(name="ifsc_code")
	private String ifscCode;
	@Column(name="bank_name")
	private String bankName;
	@Column(name="bank_branch")
	private String bankBranch;
	@Column(name="bank_location")
	private String bankLocation;
	@Column(name="is_active")
	private String isActive;
}
