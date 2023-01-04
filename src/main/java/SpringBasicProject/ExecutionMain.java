package SpringBasicProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExecutionMain {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) context.getBean("student");
        student.getStudnetData();
        student.validateStudentName();

        Department department = (Department) context.getBean("department");
        department.validateDepartmentName();
        department.getDepartmentData();

    }
}
