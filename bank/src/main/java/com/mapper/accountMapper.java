package com.mapper;

import com.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface accountMapper {
    Account login(@Param("username") String username);
    int modifyPwd(@Param("username") String username,@Param("pwd") String pwd);
    int exitsCard(@Param("inCard") String inCard);
    int moneyEnough(@Param("money") double money,@Param("outCard") String outCard);
    int frozenCard(@Param("inCard") String inCard);
    int inMoney(@Param("money") double money,@Param("inCard") String inCard);
    int outMoney(@Param("money")double money,@Param("outCard") String outCard);
    double searchBalance(@Param("cardNo") String cardNo);
}
