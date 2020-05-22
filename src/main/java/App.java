import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = 
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean =
                (Cat) applicationContext.getBean("cat");
        HelloWorld helloWorldBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBeanSecond =
                (Cat) applicationContext.getBean("cat");
        System.out.println("cats " + (catBean == catBeanSecond));
        System.out.println("hello world  " + (bean == helloWorldBean));
    }
}