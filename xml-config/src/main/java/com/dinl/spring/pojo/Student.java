package com.dinl.spring.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Student {
    private String name;
    private int age;
    private Map<String,Integer> score;
    private Address address;
    private List<String> books;
    private Set<String> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Map<String, Integer> getScore() {
        return score;
    }

    public void setScore(Map<String, Integer> score) {
        this.score = score;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getHobby() {
        return hobby;
    }

    public void setHobby(Set<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ",\n age=" + age +
                ",\n score=" + score +
                ",\n address=" + address +
                ",\n books=" + books +
                ",\n hobby=" + hobby +
                '}';
    }
}
