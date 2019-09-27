package com.service;

import com.github.pagehelper.PageInfo;
import com.pojo.TransactionRecord;
import com.pojo.Util;


public interface transactionrecordService {
    PageInfo<TransactionRecord> searchByCardNo(String cardNo, Util util);
}
