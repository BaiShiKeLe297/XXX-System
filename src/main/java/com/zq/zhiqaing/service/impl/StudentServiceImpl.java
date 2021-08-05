package com.zq.zhiqaing.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zq.zhiqaing.base.AjaxResult;
import com.zq.zhiqaing.dao.StudentDao;
import com.zq.zhiqaing.domain.Student;
import com.zq.zhiqaing.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author : BZQ
 * @Date: 2021/7/25 19:21
 * @Description :
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

//    /**
//     * 查看所有的学生
//     */
//    @Override
//    public List<Student> findAllStudent() {
//        QueryWrapper wrapper = new QueryWrapper();
//        return studentDao.selectList(wrapper);
//    }

    /**
     * 查看所有的学生
     */
    @Override
    public AjaxResult findAllStudent() {

        PageHelper.startPage(2,3);
        
        List<Student> allStudent = studentDao.findAllStudent();
        System.out.println(allStudent);
        PageInfo pageInfo = new PageInfo(allStudent);
        return AjaxResult.ok(pageInfo) ;
    }

    /**
     * 保存一个学生的信息。
     *
     * @param student
     * @return
     */
    @Override
    public AjaxResult saveStudent(Student student) {
        int insert = studentDao.insert(student);
        System.out.println(insert);
        if (insert>0){
            return AjaxResult.ok();
        }
        return AjaxResult.error("保存失败 ！");
    }
}
