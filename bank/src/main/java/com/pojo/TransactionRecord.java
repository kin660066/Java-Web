package com.pojo;

import java.util.Date;

public class TransactionRecord {
    /*
    id	bigint	20	0	0	-1	0	0	0		0					-1	0
cardNo	varchar	16	0	0	0	0	0	0		0		utf8	utf8_general_ci		0	0
transctionDate	datetime	0	0	0	0	0	0	0		0					0	0
transactionAmount	decimal	11	2	0	0	0	0	0		0					0	0
balance	decimal	11	2	0	0	0	0	0		0					0	0
transactionType	varchar	255	0	0	0	0	0	0		0		utf8	utf8_general_ci		0	0
remark	varchar	255	0	-1	0	0	0	0		0		utf8	utf8_general_ci		0	0

     */
    private Long id;
    private String cardNo;

    private Date transctionDate;
    private double transactionAmount;
    private double balance;
    private String transactionType;
    private String remark;
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getTransctionDate() {
        return transctionDate;
    }

    public void setTransctionDate(Date transctionDate) {
        this.transctionDate = transctionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
