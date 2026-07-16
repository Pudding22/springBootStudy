package org.example.mapper;

import org.example.entity.Clazz;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {

    // 根据班级ID查询班级及其所有学生
    Clazz getClazzAndStudents(@Param("id") int id);
}