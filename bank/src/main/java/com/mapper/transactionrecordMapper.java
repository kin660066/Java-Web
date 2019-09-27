package com.mapper;

import com.pojo.TransactionRecord;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface transactionrecordMapper {
    void transfer(TransactionRecord transactionRecord);
    List<TransactionRecord> searchRecordByTime(@Param("cardNo") String cardNo,@Param("start") Date start,@Param("end") Date end);
}
