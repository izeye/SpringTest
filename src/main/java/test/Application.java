package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by izeye on 2014. 11. 7..
 */
@Configuration
public class Application {

    @Bean
    public InterfaceA beanA() {
        return new ClassA();
    }

    @Autowired
//    private ClassA beanA;
    private InterfaceA beanA;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(Application.class);
    }

}
