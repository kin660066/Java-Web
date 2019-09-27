package com.controller;

import com.pojo.newsComment;
import com.pojo.newsDetail;
import com.service.detailService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news")
public class newsController {

    @Autowired
    private detailService detailService;


    @RequestMapping("/main")
    public String index(Model model) {
        List<newsDetail> list = detailService.searchAll();
        List<newsComment> listc = detailService.searchAllNewsid();
        model.addAttribute("listc",listc);
        model.addAttribute("list",list);
        return "main";
    }
    @RequestMapping("/search")
    public String searchByTile(Model model ,String title){
        List<newsDetail> list = detailService.searchByTile(title);
        model.addAttribute("list",list);
        model.addAttribute("title1",title);
        return "main";
    }
    @RequestMapping("/delete")
    public String delete(Integer id,Model model){
        if(detailService.deleteById(id)==true){
            model.addAttribute("msg","删除成功");
        }else {
            model.addAttribute("msg","删除失败");
        }
        List<newsDetail> list = detailService.searchAll();
        model.addAttribute("list",list);
        return "main";
    }
    @RequestMapping("/toAddComment")
    public String toAddComment(String title,Integer id,Model model){
        model.addAttribute("title",title);
        model.addAttribute("id",id);
        return "addComment";
    }

    @RequestMapping("/addComment")
    public String addComment(String id,String content,String username,Model model){
        System.out.println(id+content+username);
        if(detailService.insertOne(id, content, username)==true){
            List<newsDetail> list = detailService.searchAll();
            model.addAttribute("list",list);
            return "main";}
        else{
            return "addComment";
        }
    }
    @RequestMapping("searchComment")
    public String searchComment(Model model,String newsid){
        List<newsComment> list = detailService.commentByNewisd(newsid);
        model.addAttribute("list",list);
        return "viewComment";
    }

    @RequestMapping("searchComment2")
    public String searchComment2(Model model,Integer nid){
        if (nid==0){
            nid=null;
        }
        List<newsComment> list = detailService.commentByNewisd(nid);
        model.addAttribute("list",list);
        return "viewComment";
    }

}
