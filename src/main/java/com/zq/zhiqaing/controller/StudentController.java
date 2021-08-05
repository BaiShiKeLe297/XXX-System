package com.zq.zhiqaing.controller;

import com.zq.zhiqaing.base.AjaxResult;
import com.zq.zhiqaing.domain.Student;
import com.zq.zhiqaing.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : BZQ
 * @Date: 2021/7/25 20:56
 * @Description :
 */

@RestController
@Api(value = "StudentController",tags = "学生管理")
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping("findAllStudent")
    @ApiOperation("查寻所有的学生")
    public AjaxResult findAllStudent(){
        return studentService.findAllStudent();
    }

    @ResponseBody
    @PostMapping("saveStudent")
    @ApiOperation("保存学生")
    public AjaxResult saveStudent(@RequestBody Student student){
        return AjaxResult.ok();
    }

}
