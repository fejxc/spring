package com.sunyun.ba05;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myXuexiao")
public class School {

    @Value("玉山一中")
    private String name;
    @Value("上饶市玉山县")
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
