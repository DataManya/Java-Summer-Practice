package manina.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TVRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TVConfig.class);

        TV tv = context.getBean(TV.class);
        tv.tvCheck();
    }
}
