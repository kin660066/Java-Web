package com.service.impl;

import com.mapper.detailMapper;
import com.pojo.newsComment;
import com.pojo.newsDetail;
import com.service.detailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("detailService")
public class detailServiceImpl implements detailService {
    @Autowired
    private detailMapper mapper;
    @Override
    public List<newsDetail> searchAll() {
        return  mapper.searchAll();
    }

    @Override
    public List<newsDetail> searchByTile(String title) {
        return mapper.searchByTile(title);
    }

    @Override
    public boolean deleteById(Integer id) {
        if(mapper.deleteById(id)>0){
        return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean insertOne(String id, String content, String author) {
        if(mapper.insertOne(id,content,author)>0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<newsComment> commentByNewisd(String newsid) {
       return mapper.commentByNewsid(newsid);
   }

    @Override
    public List<newsComment> searchAllNewsid() {
        return mapper.searchAllNewsid();
    }

    @Override
    public List<newsComment> commentByNewisd(Integer newsid) {
        return mapper.commentByNewsid2(newsid);
    }
}
