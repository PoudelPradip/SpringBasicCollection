package SpringBasicProject;

import javax.swing.plaf.DesktopPaneUI;

public class Institute {
    private Department department;
    private Student student;

public void displayData(){
    student.validateStudentId();
    student.validateStudentName();
    student.getStudnetData();
    department.validateDepartmentName();
    department.getDepartmentData();

        }
}
