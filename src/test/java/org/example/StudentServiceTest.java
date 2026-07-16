package org.example;

import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentMapper studentMapper;  // 注入 Mapper


    @Test
    public void testSelectById() {
        int id = 1;

        Student student = studentMapper.selectById(id);
        System.out.println(student);
    }


    @Test
    public void testSelectByCondition() {
        int age = 20;
        String name = "芳";

        //处理参数
        name = "%" + name + "%";

        Map map = new HashMap();
        map.put("age", age);
        map.put("name", name);

        List<Student> students = studentMapper.selectByCondition(map);
//        System.out.println(students);
        students.forEach(System.out::println);
    }

    @Test
    public void testSelectByCondition2() {
//        int age = 16;
        String name = "张";

        //处理参数
        name = "%" + name + "%";

        Map map = new HashMap();
//        map.put("age", age);
        map.put("name", name);

        List<Student> students = studentMapper.selectByCondition2(map);
//        System.out.println(students);
        students.forEach(System.out::println);
    }

    @Test
    public void testInsert() {

        String stuNo = "2023996";
        int age = 15;
        String name = "张五";
        String sex = "男";


        Student student = new Student();
        student.setStuNo(stuNo);
        student.setName(name);
        student.setAge(age);
        student.setSex(sex);

        studentMapper.addStudent(student);
        Integer id = student.getId();
        System.out.println("新插入数据的id为：" + id);

    }

    @Test
    public void testUpdate() {
        int age = 14;
        String name = "张六";
        int classId = 1;
        int id = 650;

        int count = studentMapper.updateStudent(id, name, age, classId);
        System.out.println(count);
    }

    @Test
    public void testdelete() {
        int id = 647;

        int count = studentMapper.deleteStudent(id);
        System.out.println(count + "行已删除");
    }

    @Test
    public void testdelete2() {
        int[] ids = {643,644};

        int count = studentMapper.delete2Student(ids);
        System.out.println(count + "行已删除");
    }

    @Test
    public void getStuAndClass() {
        int id = 1;

        Student student = studentMapper.getStuAndClass(id);
        System.out.println(student);
    }

}