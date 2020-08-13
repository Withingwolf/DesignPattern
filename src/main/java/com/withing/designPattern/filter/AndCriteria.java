package com.withing.designPattern.filter;

import java.util.List;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:17:10
 * description: AndCriteria
 */
public class AndCriteria implements Criteria {

    private final Criteria criteria1;

    private final Criteria criteria2;

    public AndCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> filterPerson(List<Person> list) {
        return criteria2.filterPerson(criteria1.filterPerson(list));
    }
}
