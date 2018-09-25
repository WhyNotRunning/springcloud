package com.test.springcloud.client.entity;

import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.age
     *
     * @mbggenerated
     */
    private Integer age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.sex
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.mark
     *
     * @mbggenerated
     */
    private Integer mark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.cre_time
     *
     * @mbggenerated
     */
    private Date creTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.upd_time
     *
     * @mbggenerated
     */
    private Date updTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.age
     *
     * @return the value of user.age
     *
     * @mbggenerated
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.age
     *
     * @param age the value for user.age
     *
     * @mbggenerated
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.sex
     *
     * @return the value of user.sex
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.sex
     *
     * @param sex the value for user.sex
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.mark
     *
     * @return the value of user.mark
     *
     * @mbggenerated
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.mark
     *
     * @param mark the value for user.mark
     *
     * @mbggenerated
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.cre_time
     *
     * @return the value of user.cre_time
     *
     * @mbggenerated
     */
    public Date getCreTime() {
        return creTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.cre_time
     *
     * @param creTime the value for user.cre_time
     *
     * @mbggenerated
     */
    public void setCreTime(Date creTime) {
        this.creTime = creTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.upd_time
     *
     * @return the value of user.upd_time
     *
     * @mbggenerated
     */
    public Date getUpdTime() {
        return updTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.upd_time
     *
     * @param updTime the value for user.upd_time
     *
     * @mbggenerated
     */
    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", mark=").append(mark);
        sb.append(", creTime=").append(creTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}