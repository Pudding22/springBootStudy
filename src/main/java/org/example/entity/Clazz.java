package org.example.entity;


import lombok.Data;

import java.util.List;

@Data
public class Clazz {
    private Integer id;
    private String name;
    private Integer grade;
    private String clazz;
    private Integer teacherId;

    private List<Student> students;
}
