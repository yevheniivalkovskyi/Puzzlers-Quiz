package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "spring/")
public class SpringConfiguration {


    @Bean(name = "secondBean")
    public SimpleBean simpleBean(){
        //name will be secondBean
        return new SimpleBean();
    }

}
