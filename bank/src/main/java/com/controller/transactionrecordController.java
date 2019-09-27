package com.controller;

import com.github.pagehelper.PageInfo;
import com.pojo.TransactionRecord;
import com.pojo.Util;
import com.service.transactionrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/transactionrecord")
public class transactionrecordController {

    @Autowired
    private transactionrecordService transactionrecordService;

    @RequestMapping("toRecord")
    public String toRecord(Model model){
        model.addAttribute("page","Record");
        return "index2";
    }

    @RequestMapping("searchRecord")
    public String searchRecord(Model model, String cardNo, Util util){
        System.out.println(util.getPageSize());
        PageInfo<TransactionRecord> pageInfo = transactionrecordService.searchByCardNo(cardNo,util);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("page","Record");
        return "index2";
    }
}
