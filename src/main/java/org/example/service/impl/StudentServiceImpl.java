package org.example.service.impl;


import org.apache.ibatis.annotations.Param;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl  implements StudentService {

    @Autowired  // 自动注入StudentMapper
    private StudentMapper studentMapper;

    @Override
    public List<Student> getStudentsByName(String name) {
        // 调用Mapper层查询数据
        return studentMapper.selectByName(name);
    }
    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
    @Override
    public int updateStudent(Student student) {
        int count = studentMapper.updateStudent(student);
        return count;
    }
    @Override
    public int deleteStudent(@Param("ids") List<Integer> ids) {
        int count = studentMapper.deleteStudent(ids);
        return count;
    }

}

