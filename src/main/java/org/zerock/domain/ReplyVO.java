package org.zerock.domain;

import java.util.Date;

/**
 * Created by wtime on 2017-02-13. ${time}
 * org.zerock.domain / Web Ex02
 * Better late than never!
 */


public class ReplyVO {

    private Integer rno;
    private Integer bno;
    private String replytext;
    private String replyer;

    private Date regdate;
    private Date updatedate;

    public Integer getRno() {
        return rno;
    }

    public void setRno(Integer rno) {
        this.rno = rno;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public String getReplytext() {
        return replytext;
    }

    public void setReplytext(String replytext) {
        this.replytext = replytext;
    }

    public String getReplyer() {
        return replyer;
    }

    public void setReplyer(String replyer) {
        this.replyer = replyer;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getUpdaterdate() {
        return updatedate;
    }

    public void setUpdaterdate(Date updaterdate) {
        this.updatedate = updaterdate;
    }

    @Override
    public String toString() {
        return "ReplyVO{" +
                "rno=" + rno +
                ", bno=" + bno +
                ", replytext='" + replytext + '\'' +
                ", replyer='" + replyer + '\'' +
                ", regdate=" + regdate +
                ", updatedate=" + updatedate +
                '}';
    }
}
