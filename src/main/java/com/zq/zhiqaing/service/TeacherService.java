package com.zq.zhiqaing.service;

import com.zq.zhiqaing.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/8/4 21:19
 * @Description :
 */

public interface TeacherService {

    /**
     * 查询所有的老师
     * 测试一下 通过 page 分页。
     * @return
     */
    List<Teacher> findAllTeacher();

}
