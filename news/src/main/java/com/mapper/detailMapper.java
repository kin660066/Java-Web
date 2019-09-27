package com.mapper;

import com.pojo.newsComment;
import com.pojo.newsDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface detailMapper {
    List<newsDetail> searchAll();
    List<newsDetail> searchByTile(String title);
    int deleteById(Integer id);
    int insertOne(@Param("newsid") String id,@Param("content") String content,@Param("author") String author);
    List<newsComment> commentByNewsid (@Param("newsid") String newsid);
    List<newsComment> searchAllNewsid();
    List<newsComment> commentByNewsid2 (@Param("newsid") Integer newsid);
}
