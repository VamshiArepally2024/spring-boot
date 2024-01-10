package com.vamshi.bank_ex.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//request->controller -> service->repository->db

//we can use entity for mapping java class to database table 
@Entity
// suppose if we change the table name in database ,we use @table annotation
@Table(name = "SAVING_ACCOUNT")
public class SavingAccount {
	// unique primary key in data base table
	@Id
	// automatic generating the values
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ACCOUNT_ID")
	private long acc_id;
	// automatic generating the values
	@Column(name = "ACCOUNT_NUMBER")
	private long acc_num;
	// suppose if we change the column name in database table ,we use @Column
	// annotation
	@Column(name = "ACCOUNT_HOLDER_NAME")
	// suppose if we change the column name in database table ,we use @Column
	// annotation
	private String acc_holder_name;
	// suppose if we change the column name in database table ,we use @Column
	// annotation
	@Column(name = "ACCOUNT_BALANCE")
	private double acc_bal;
	// here,observe i am not appling annotation,by default this field is the table
	// column
	private String ifsc_code;
	// here,observe i am not appling annotation,by default this field is the table
	// column
	private String branch_name;

	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public long getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(long acc_id) {
		this.acc_id = acc_id;
	}

	public long getAcc_num() {
		return acc_num;
	}

	public void setAcc_num(long acc_num) {
		this.acc_num = acc_num;
	}

	public String getAcc_holder_name() {
		return acc_holder_name;
	}

	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}

	public double getAcc_bal() {
		return acc_bal;
	}

	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

}
