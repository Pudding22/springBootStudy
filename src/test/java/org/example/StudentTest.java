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
public class StudentTest {

    @Autowired
    private StudentMapper studentMapper;  // 注入 Mapper



}
