package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.AppConfig;
import peaksoft.HelloWorld;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean==bean1);
        System.out.println(bean.equals(bean1));

        System.out.println(bean.getMessage());

        Cat bean2= applicationContext.getBean("cat",Cat.class);
        Cat bean3= applicationContext.getBean("cat",Cat.class);
        System.out.println(bean2==bean3);
        System.out.println(bean2.equals(bean3));

    }
}
