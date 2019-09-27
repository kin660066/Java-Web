package com.pojo;

import java.util.List;

public class Account {
    /*
    id	bigint	20	0	0	-1	0	0	0		0	编号				-1	0
cardNo	varchar	16	0	0	0	0	0	0		0	卡号	utf8	utf8_general_ci		0	0
password	varchar	6	0	0	0	0	0	0		0	密码	utf8	utf8_general_ci		0	0
balance	decimal	11	2	0	0	0	0	0	0.00	0					0	0
status	int	1	0	0	0	0	0	0	1	0	状态				0	0

     */
    private Long id;
    private String cardNo;
    private String password;
    private double balance;
    private Integer status;
    private List<TransactionRecord> transactionRecordList;

    public List<TransactionRecord> getTransactionRecordList() {
        return transactionRecordList;
    }

    public void setTransactionRecordList(List<TransactionRecord> transactionRecordList) {
        this.transactionRecordList = transactionRecordList;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
