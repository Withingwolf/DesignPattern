package com.withing.designPattern.filter;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangweixin7
 * @date 2020/8/13 11:28:09
 * description: DemoClient
 */
public class DemoClient {

    @Test
    public void testFilter() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));
        persons.add(new Person("Bob", "Male", "Married"));
        Criteria bName = new NameCriteria("B.*");
        Criteria male = new GenderCriteria("Male");
        Criteria female = new GenderCriteria("Female");
        Criteria single = new MaritalStatusCriteria("Single");
        Criteria singleMale = new AndCriteria(male, single);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Open with B:" + bName.filterPerson(persons));
        System.out.println("male:" + male.filterPerson(persons));
        System.out.println("female:" + female.filterPerson(persons));
        System.out.println("single:" + single.filterPerson(persons));
        System.out.println("single and male:" + singleMale.filterPerson(persons));
        System.out.println("single or female:" + singleOrFemale.filterPerson(persons));
    }
}
