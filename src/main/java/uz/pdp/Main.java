package uz.pdp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);
        Person person3 = context.getBean(Person.class);

        System.out.println(System.identityHashCode(person1));
        System.out.println(System.identityHashCode(person2));
        System.out.println(System.identityHashCode(person3));
    }
}