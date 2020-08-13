package com.withing.designPattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:16:59
 * description: MaritalStatusCriteria
 */
public class MaritalStatusCriteria implements Criteria {
    /**
     * 婚恋状态
     */
    private String maritalStatus;

    public MaritalStatusCriteria(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    @Override
    public List<Person> filterPerson(List<Person> list) {
        return list.stream().filter(x -> x.getMaritalStatus().equals(maritalStatus)).collect(Collectors.toList());
    }
}
