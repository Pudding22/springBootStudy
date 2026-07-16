package org.example;

import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


@SpringBootApplication   //标记该类为主程序启动类
public class Main {
    //主程序启动方法
    public static void main(String[] args) {
       SpringApplication.run(Main.class, args);

//        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
//
//        StudentService studentService = context.getBean(StudentService.class);
//
//        List<Student> students = studentService.list();
//
//        students.forEach(System.out::println);  // 打印所有学生
//
//
//        context.close();

    }
}