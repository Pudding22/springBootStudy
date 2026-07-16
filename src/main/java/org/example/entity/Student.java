package org.example.entity;


import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;


@Data
public class Student {
    private Integer id;
    private String stuNo;          // 学号
    private String name;           // 姓名
    private Integer age;           // 年龄
    private String sex;            // 性别
    private String classId;      // 班级id
    private LocalDateTime createTime;

    private Clazz clazz;   // 必须和association的property名字一致

    private List<Hobby> hobbies;
}
