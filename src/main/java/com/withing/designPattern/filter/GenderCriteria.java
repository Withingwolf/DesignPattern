package com.withing.designPattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:15:59
 * description: GenderCriteria
 */

public class GenderCriteria implements Criteria {

    /**
     * 性别
     */
    private String gender;

    public GenderCriteria(String gender) {
        this.gender = gender;
    }

    public GenderCriteria() {
    }

    @Override
    public List<Person> filterPerson(List<Person> list) {
        return list.stream().filter(x -> x.getGender().equals(gender)).collect(Collectors.toList());
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
