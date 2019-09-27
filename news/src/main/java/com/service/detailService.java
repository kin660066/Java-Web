package com.service;

import com.pojo.newsComment;
import com.pojo.newsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface detailService {
     List<newsDetail> searchAll();
     List<newsDetail> searchByTile(String title);
     boolean deleteById(Integer id);
     boolean insertOne(String id, String content, String author);
     List<newsComment> commentByNewisd(String newsid);
     List<newsComment> searchAllNewsid();
     List<newsComment> commentByNewisd(Integer newsid);

}
