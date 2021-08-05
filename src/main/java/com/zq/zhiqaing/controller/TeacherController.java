package com.zq.zhiqaing.controller;

import com.zq.zhiqaing.base.AjaxResult;
import com.zq.zhiqaing.domain.Teacher;
import com.zq.zhiqaing.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/8/4 21:25
 * @Description :
 */

@RestController
@RequestMapping("teacher")
@Api(value = "TeacherController" , tags = "老师管理")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/findAllTeacher")
    public AjaxResult findAllTeacher(){
        List<Teacher> allTeacher = teacherService.findAllTeacher();
        return AjaxResult.ok(allTeacher);
    }

}
