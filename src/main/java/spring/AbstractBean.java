package spring;


import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AbstractBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        for (Map.Entry<String, SimpleBean> stringSimpleBeanEntry : applicationContext.getBeansOfType(SimpleBean.class).entrySet()) {
            System.out.println("Key = "+stringSimpleBeanEntry.getKey());
            System.out.println("Value = " + stringSimpleBeanEntry.getValue().toString());
        }

    }
}
