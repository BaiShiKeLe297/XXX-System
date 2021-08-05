package com.zq.zhiqaing.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zq.zhiqaing.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/7/25 19:17
 * @Description :
 */

@Mapper
@Repository
public interface StudentDao extends BaseMapper<Student> {

    List<Student> findAllStudent();



}
