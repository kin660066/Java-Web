package com.service.impl;

import com.mapper.accountMapper;
import com.mapper.transactionrecordMapper;
import com.pojo.Account;
import com.pojo.TransactionRecord;
import com.service.accountService;
import com.statusConstant.constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;

@Service("accountService")
public class accountServiceImpl implements accountService {
    @Autowired
    private accountMapper accountMapper;

    @Autowired
    private transactionrecordMapper transactionrecordMapper;

    @Override
    public Account login(String username) {
        return accountMapper.login(username);
    }

    @Override
    public boolean modifyPwd(String username, String pwd) {
        boolean flag=false;
        if(accountMapper.modifyPwd(username,pwd)>0){
            flag=true;
        }
        return flag;
    }

    @Override
    public HashMap<String,Object> transfer(double money, String cardNo, String myCard) {
        HashMap<String,Object> map = new HashMap<>();
        int code=constant.CARD_EXIST;
        String msg="";
        if(accountMapper.exitsCard(cardNo)>0){
            if (accountMapper.frozenCard(cardNo)>0){
                if (accountMapper.moneyEnough(money,myCard)>0){
                    accountMapper.inMoney(money,cardNo);
                    accountMapper.outMoney(money,myCard);
                    TransactionRecord transactionRecord = new TransactionRecord();
                    transactionRecord.setCardNo(myCard);
                    transactionRecord.setTransactionAmount(money);
                    transactionRecord.setBalance(accountMapper.searchBalance(myCard));
                    transactionRecord.setTransactionType("转账");
                    transactionRecord.setTransctionDate(new Date());
                    transactionrecordMapper.transfer(transactionRecord);
                }else{
                    code=constant.MONEY_NO_ENOUGH;
                    msg=constant.MONEY_NO_ENOUGH1;
                }
            }else{
                msg=constant.CARD_FORZEN1;
                code=constant.CARD_FORZEN;
            }
        }else{
            code=constant.CARD_NO_EXIST;
            msg= constant.CARD_NO_EXIST1;
        }
        map.put("msg",msg);
        map.put("code",code);
        return map;
    }


}
