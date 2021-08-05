package com.zq.zhiqaing.service;

import com.zq.zhiqaing.base.AjaxResult;
import com.zq.zhiqaing.domain.Student;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/7/25 19:23
 * @Description :
 */

public interface StudentService {

    /**
     * 查看所有的学生
     */
    AjaxResult findAllStudent();

    /**
     * 保存一个学生的信息。
     * @param student
     * @return
     */
    AjaxResult saveStudent(Student student);

}
