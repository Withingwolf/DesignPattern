package com.withing.designPattern.filter;

import java.util.*;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:17:22
 * description: OrCriteria
 */
public class OrCriteria implements Criteria {

    private final Criteria criteria1;

    private final Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> filterPerson(List<Person> list) {
        List<Person> personList1 = Optional.ofNullable(list).map(criteria1::filterPerson).orElse(new ArrayList<>());
        List<Person> personList2 = Optional.ofNullable(list).map(criteria2::filterPerson).orElse(new ArrayList<>());
        Set<Person> personSet = new HashSet<>(personList1);
        personSet.addAll(personList2);
        return new ArrayList<>(personSet);
    }
}
