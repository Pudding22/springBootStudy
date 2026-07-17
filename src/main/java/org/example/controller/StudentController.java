package org.example.controller;

import org.example.common.Result;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController  // 标记为控制器，所有方法返回JSON数据
@RequestMapping("/api/students")  // 接口统一前缀
public class StudentController {

    @Autowired  // 自动注入StudentService
    private StudentService studentService;

    /**
     * 根据姓名查询学生
     * GET /api/students/search?name=张三
     */
    @GetMapping("/search")
    public Result searchByName(@RequestParam(required = false) String name) {
        try {
            // 调用Service层查询
            List<Student> students = studentService.getStudentsByName(name);
            // 返回成功结果
            return Result.success(students);
        } catch (Exception e) {
            // 发生异常返回错误信息
            return Result.error("查询失败：" + e.getMessage());
        }
    }

    /**
     * 添加学生数据
     * @param student
     * @return
     */
    @PostMapping
    public Result addStudent(@RequestBody Student student) {
        try {
            studentService.addStudent(student);
            return Result.success("添加成功");
        } catch (Exception e) {
            // 发生异常返回错误信息
            return Result.error("添加失败：" + e.getMessage());
        }
    }

    /**
     * 修改学生数据
     */
    @PutMapping
    public Result updateStudent(@RequestBody Student student) {
        try {
            int count = studentService.updateStudent(student);
            return Result.success("成功修改 " + count + " 条数据");
        } catch (Exception e) {
            // 发生异常返回错误信息
            return Result.error("修改失败：" + e.getMessage());
        }
    }
    /**
     * 批量删除学生数据
     */
    @DeleteMapping("/batch")
    //public Result deleteStudent(@RequestBody List<Integer> ids) {      这种传参只能传数组，前端如同时传别的参数不行
    public Result deleteBatch(@RequestBody Map<String, List<Integer>> request) {
        try {
            List<Integer> ids = request.get("ids");
            int count = studentService.deleteStudent(ids);
            return Result.success("成功删除 " + count + " 条数据");
        } catch (Exception e) {
            // 发生异常返回错误信息
            return Result.error("删除失败：" + e.getMessage());
        }
    }
}