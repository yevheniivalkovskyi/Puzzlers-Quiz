package spring;

import org.springframework.stereotype.Component;

@Component
public class SimpleBean {

    private int age;

    private String name;


    @Override
    public String toString() {
        return "SimpleBean{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public SimpleBean() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
