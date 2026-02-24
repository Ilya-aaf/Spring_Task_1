import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {


            HelloWorld bean1 =
                    (HelloWorld) applicationContext.getBean("helloworld");
            System.out.println(bean1.getMessage());
            HelloWorld bean2 =
                    (HelloWorld) applicationContext.getBean("helloworld");
            System.out.println(bean2.getMessage());

            Cat cat1 =
                    (Cat) applicationContext.getBean("cat");
            Cat cat2 = applicationContext.getBean("cat", Cat.class);
            System.out.println(bean1 == bean2);
            System.out.println(cat1 == cat2);

        }
    }
}