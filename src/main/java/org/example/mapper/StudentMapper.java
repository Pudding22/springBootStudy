/*
package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.example.entity.Student;


public interface StudentMapper extends BaseMapper<Student> {


}

 */


package org.example.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.entity.Student;

import javax.swing.*;
import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    // 查询所有
//    List<Student> findAll();

    /**
     * 根据ID查询
     */
    Student selectById(@Param("id") int id);
    /**
     * 多条件动态查询
     */
//    List<Student> selectByCondition(@Param("age") int age, @Param("name") Spring name);

    List<Student> selectByCondition(Map map);    //用泛型写map,list set   ipage

    /**
     *单条件动态查询
     */
    List<Student> selectByCondition2(Map map);

    /**
     * 添加
     */
    void addStudent(Student student);

    /**
     * 修改
     */
    int updateStudent(@Param("id") int id,@Param("name") String name,@Param("age") int age,@Param("classId") int classId);

    /**
     * 删除
     */
    int deleteStudent(@Param("id") int id);

    int delete2Student(@Param("ids") int[] ids);









    /**
     *查询学生及学生对应的班级信息
     */
    Student getStuAndClass(@Param("id") int id);

    Student getStuAndHobby(@Param("id") int id);

}

