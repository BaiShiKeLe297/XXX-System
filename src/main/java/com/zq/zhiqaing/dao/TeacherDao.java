package com.zq.zhiqaing.dao;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zq.zhiqaing.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/8/4 21:17
 * @Description :
 */
@Mapper
public interface TeacherDao {

    List<Teacher> findAllTeacher(Page<Teacher> page);

}
