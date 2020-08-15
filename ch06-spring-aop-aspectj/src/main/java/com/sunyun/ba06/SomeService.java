package com.sunyun.ba06;

import com.sunyun.ba02.Student;

public interface SomeService {
    void doSome(String name, Integer age);
    String doOther(String name, Integer age);
    Student doOther2(String name, Integer age);

    String doFist(String name, Integer age);
    void doSecond();

    void doThird();
}
