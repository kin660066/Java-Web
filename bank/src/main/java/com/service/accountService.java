package com.service;

import com.pojo.Account;

import java.util.HashMap;

public interface accountService {
    Account login(String username);
    boolean modifyPwd(String username,String pwd);

    HashMap<String,Object> transfer(double money, String cardNo, String myCard);
}
