package org.zerock.domain;

import java.util.Date;

/**
 * Created by wtime on 2017-02-20. ${time}
 * org.zerock.domain / Web Ex02
 * Better late than never!
 */


public class LoginTVO {

    private String userid;
    private String userpw;
    private String username;
    private String useremail;
    private Date regdate;
    private Date updatedate;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    @Override
    public String toString() {
        return "LoginTVO{" +
                "userid='" + userid + '\'' +
                ", userpw='" + userpw + '\'' +
                ", username='" + username + '\'' +
                ", useremail='" + useremail + '\'' +
                ", regdate=" + regdate +
                ", updatedate=" + updatedate +
                '}';
    }
}
