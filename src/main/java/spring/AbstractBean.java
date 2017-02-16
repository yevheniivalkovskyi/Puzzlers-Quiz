package spring;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AbstractBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        ApplicationContext applicationContextXml = new ClassPathXmlApplicationContext("classpath:context.xml");

        AnotherBean anotherBean = (AnotherBean) applicationContextXml.getBean("anotherBean");
        System.out.println(anotherBean.getDefinition());
    }
}
