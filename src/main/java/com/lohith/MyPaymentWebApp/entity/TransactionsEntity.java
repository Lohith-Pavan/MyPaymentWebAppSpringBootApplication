package com.lohith.MyPaymentWebApp.entity;

import java.time.LocalDateTime;

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
@Table(name="txn_details")
public class TransactionsEntity {
    @Id
    @Column(name="txn_id")
    private long txnId;
	@Column(name="txn_date_time")
	private LocalDateTime txnDateTime;
	@Column(name="source_id")
	private long sourceId;
	@Column(name="target_id")
	private long targetId;
	@Column(name="source_type_code")
	private String sourceTypeCode;
	@Column(name="dest_type_code")
	private String destTypeCode;
	@Column(name="txn_amount")
	private double txnAmount;
}
