package xyz.fz.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"application-provider.xml"});
        context.start();
        // press any key to exit
        int c = System.in.read();
        System.out.println((char) c);
    }
}
