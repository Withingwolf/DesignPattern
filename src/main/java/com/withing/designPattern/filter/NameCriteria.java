package com.withing.designPattern.filter;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:15:41
 * description: NameCriteria
 */
public class NameCriteria implements Criteria {


    private Pattern pattern;

    public NameCriteria(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public List<Person> filterPerson(List<Person> list) {
        return list.stream().filter(x -> pattern.matcher(x.getName()).find()).collect(Collectors.toList());
    }
}
