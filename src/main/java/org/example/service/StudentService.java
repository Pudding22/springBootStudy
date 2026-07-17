package org.example.service;

import org.apache.ibatis.annotations.Param;
import org.example.entity.Student;

import java.util.List;

public interface StudentService {

    /**
     * 根据姓名查询学生列表
     * @param name 姓名
     * @return 学生列表
     */
    List<Student> getStudentsByName(String name);

    /**
     * 插入学生数据
     */
    void addStudent(Student student);

    /**
     * 修改学生数据
     */
    int updateStudent(Student student);

    int deleteStudent(@Param("ids") List<Integer> ids);

}