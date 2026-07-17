package org.example.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@NoArgsConstructor // 自动生成无参构造方法
@AllArgsConstructor // 自动生成全参构造方法                    //这两个注解是必要的吗？
public class Student {
    private Integer id;
    private String stuNo;          // 学号
    private String name;           // 姓名
    private Integer age;           // 年龄
    private String sex;            // 性别
    private Integer classId;      // 班级id
    private LocalDateTime createTime;

    private Clazz clazz;   // 必须和association的property名字一致

    private List<Hobby> hobbies;
}
