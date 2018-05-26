package com.dml.accounting;

/**
 * 一个账户
 * 
 * @author neo
 *
 */
public class Account {

	private String id;

	private AccountOwner owner;

	private AccountingSubject subject;

	/**
	 * 余额
	 */
	private double balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountOwner getOwner() {
		return owner;
	}

	public void setOwner(AccountOwner owner) {
		this.owner = owner;
	}

	public AccountingSubject getSubject() {
		return subject;
	}

	public void setSubject(AccountingSubject subject) {
		this.subject = subject;
	}

}
