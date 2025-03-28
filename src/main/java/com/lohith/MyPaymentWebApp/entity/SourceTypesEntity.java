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
@Table(name = "source_types")
public class SourceTypesEntity {
	@Id
	@Column(name = "source_id")
	private long sourceId;
	@Column(name = "source_type_code")
	private String sourceTypeCode;
	@Column(name = "source_type_name")
	private String sourceTypeName;
}
