package com.pojo;

import org.omg.PortableInterceptor.Interceptor;

import java.util.Date;
import java.util.List;

public class newsDetail {
    private Integer id;
    private String title;
    private String summary;
    private String author;
    private Date createdate;
    private List<newsComment> newsComments;

    public List<newsComment> getNewsComments() {
        return newsComments;
    }

    public void setNewsComments(List<newsComment> newsComments) {
        this.newsComments = newsComments;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
