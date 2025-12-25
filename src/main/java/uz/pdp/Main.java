package uz.pdp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ioc-settings.xml"); /// config class orqali context hosil qilish
        MyBean myBean = context.getBean(MyBean.class); /// contextdan myBean ni olish
        myBean.hi();
//        MyBean2 myBean2 = context.getBean(MyBean2.class);
//        myBean2.getMyBean().hi();
    }
}