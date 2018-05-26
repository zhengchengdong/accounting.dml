package com.dml.accounting;

/**
 * 记账记录
 * 
 * @author neo
 *
 */
public class AccountingRecord {

	/**
	 * 记账帐户id
	 */
	private String accountId;

	/**
	 * 帐户记账流水号
	 */
	private long accountingNo;

	/**
	 * 记账金额，正数为收入，负数为支出
	 */
	private double accountingAmount;

	/**
	 * 后账户余额
	 */
	private double balanceAfter;

	private AccountingAction action;

}
