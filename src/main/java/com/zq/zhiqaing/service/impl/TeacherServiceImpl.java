package com.zq.zhiqaing.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zq.zhiqaing.dao.TeacherDao;
import com.zq.zhiqaing.domain.Teacher;
import com.zq.zhiqaing.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/8/4 21:21
 * @Description :
 */
@Service
@AllArgsConstructor
public class TeacherServiceImpl implements TeacherService  {

    private final TeacherDao teacherDao;


    @Override
    public List<Teacher> findAllTeacher() {
        Page<Teacher> page = new Page<>();
        page.setPages(1);
        page.setSize(2);
        return teacherDao.findAllTeacher(page);
    }
}
