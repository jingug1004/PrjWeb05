package org.zerock.domain;

/**
 * Created by macbookpro on 2017. 2. 12. PM 7:13
 * sp4chap11-Project / org.zerock.domain
 * No pain, No gain!
 */


public class SampleVO {

    private Integer mno;
    private String firstName;
    private String lastName;

    public Integer getMno() {
        return mno;
    }

    public void setMno(Integer mno) {
        this.mno = mno;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "SampleVO{" +
                "mno=" + mno +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
