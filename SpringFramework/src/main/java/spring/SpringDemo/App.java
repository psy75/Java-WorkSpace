package telusko.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
       ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
       //Dev obj=(Dev)context.getBean("dev");
       Dev obj=context.getBean(Dev.class);
       
       //obj.setAge(17);
       //System.out.println(obj.getAge());
       obj.build();
       //System.out.println(obj.getLaptop());
       obj.getCom();
       
    }
}
