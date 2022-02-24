package peaksoft;

import org.springframework.context.annotation.*;

@Configuration
  // @ComponentScan("java")
  // @PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean(name="helloworld")

    public HelloWorld getHelloWorld() {

        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
        @Bean(name="cat")
     @Scope("prototype")
     public Cat getCat(){

    Cat cat=new Cat();
    cat.setName("I am Cat");
    return cat;
        }

}
