package com.withing.designPattern.filter;

import java.util.List;

/**
 * @author huangweixin7
 * @date 2020/8/13 10:58:54
 * description: Criteria
 */
public interface Criteria {

    /**
     * 通过标准过滤人群
     *
     * @param list
     * @return
     */
    List<Person> filterPerson(List<Person> list);
}
