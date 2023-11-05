package in.TodayLearning.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.TodayLearning.beans.Student;

@Configuration
public class SpringConfig 
{
	@Bean("stdObj1")
      public Student CreateBeanStd1()
      {
    	  Student stu=new Student();
    	  stu.setName("MyName");
    	  stu.setAge(20);
    	  stu.setEmail("test@gmail.com");
    	  return stu;
      }
	
	@Bean("stdObj2")
    public Student createBeanStd2()
    {
  	  Student stu=new Student();
  	  stu.setName("Ankit");
  	  stu.setAge(40);
  	  stu.setEmail("ankit@gmail.com2");
  	  return stu;
    }
	
	
}
