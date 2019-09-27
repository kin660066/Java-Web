package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.transactionrecordMapper;
import com.pojo.TransactionRecord;
import com.pojo.Util;
import com.service.transactionrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("transactionrecordService")
public class transactionrecordServiceImpl implements transactionrecordService {

    @Autowired
    private transactionrecordMapper transactionrecordMapper;

    @Override
    public PageInfo<TransactionRecord> searchByCardNo(String cardNo, Util util) {
        PageHelper.startPage(util.getPageNum(),util.getPageSize());
        List<TransactionRecord> list = transactionrecordMapper.searchRecordByTime(cardNo,util.getStart(),util.getEnd());
        PageInfo<TransactionRecord> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
