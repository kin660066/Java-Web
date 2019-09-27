package com.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class newsComment {
    /*
    id	int	20	0	0	-1	0	0	0		0					-1	0
newsid	int	20	0	0	0	0	0	0		0					0	0
content	varchar	255	0	0	0	0	0	0		0		utf8	utf8_general_ci		0	0
authoer	varchar	100	0	-1	0	0	0	0		0		utf8	utf8_general_ci		0	0
createdate	date	0	0	0	0	0	0	0		0					0	0

     */
    private Integer id;
    private Integer newsid;
    private String content;
    private String author;
    private Timestamp createdate;
    private newsDetail newsDetail;

    public com.pojo.newsDetail getNewsDetail() {
        return newsDetail;
    }

    public void setNewsDetail(com.pojo.newsDetail newsDetail) {
        this.newsDetail = newsDetail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }
}
