package in.TodayLearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.TodayLearning.beans.Student;
import in.TodayLearning.resources.SpringConfig;

public class Main 
{
    public static void main(String args[])
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    	Student bean = (Student) context.getBean("stdObj2");  //provide here method's name 
    	bean.display();
    	
    	
    }
}
