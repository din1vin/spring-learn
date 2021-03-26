package com.dinl.spring.pojo;

/**
 * @author : dingliang
 * @since : 2021/3/25
 **/
public class Person {
    private Dog dog;
    private Cat cat;

    public Person(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Person() {
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
