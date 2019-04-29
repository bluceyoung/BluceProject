package ych.test.main;

import ych.test.entity.Student;

public class Test {
    public static void main(String[] args) {
	Student student=new Student();
	
	student.setAge(23);
	student.setName("张三");
	System.out.println(student.getName());
    }
}
