package com.sunyun.ba01;

import org.springframework.stereotype.Component;

/**
 * @Component 注解创建对象 等同于<bean></bean> 的功能
 * 属性 ： value 就是对象的名称，也就是bean中id的值
 *         value的值唯一创建的对象在Spring、容器中就一个
 * 位置：在类的上面
 * @Component(value = "myStudent") 等同于<bean id="mystudent" class="com.sunyun.ba01.Student"></bean>
 *
 * spring中和@component功能一致，创建对象的注解还有
 * 1、@Repository（用在持久层类）：放在dao的实现类上，dao对象是能访问数据库的
 * 2、@Service（用在业务层）：放在service的实现类，创建service对象，其对象是对业务做处理，有事务等功能
 * 3、@Controller（用在控制器层）：放在处理器（控制器）类上，控制器对象可以接受用户提交的参数，显示请求处理你的结果
 *
 * 以上三个注解的使用语法和@Component一样，都可以创建对象，但有额外的功能
 * @Repository、@Service、@Controller 是给项目的对象分层
 */
//使用value指定对象的名称
//@Component("student") 省略value的写法   用的最多
//@Component不指定对象名称，由spring提供默认的名称:类名的首字母小写

//@Component(value = "student")
@Component("mystudent")
public class Student {
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
