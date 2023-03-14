import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        Cat cat = (Cat) applicationContext.getBean("cat");
        cat.smartCat();
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        catTwo.smartCat();
        System.out.println("bean == beanTwo " + (bean == beanTwo));
        System.out.println("cat == catTwo " + (cat == catTwo));

    }
}