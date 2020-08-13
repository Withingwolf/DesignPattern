package com.withing.designPattern.filter;

import com.alibaba.fastjson.JSON;

/**
 * @author huangweixin7
 * @date 2020/8/13 10:59:11
 * description: Person
 */
public class Person {
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 婚恋状态
     */
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Person && this.getName().equals(((Person) obj).getName()) &&
                this.getGender().equals(((Person) obj).getGender()) &&
                this.getMaritalStatus().equals(((Person) obj).getMaritalStatus());
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
