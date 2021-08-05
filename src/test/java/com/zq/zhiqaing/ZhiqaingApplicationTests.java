package com.zq.zhiqaing;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zq.zhiqaing.dao.StudentDao;
import com.zq.zhiqaing.domain.Student;
import com.zq.zhiqaing.service.StudentService;
import com.zq.zhiqaing.service.impl.StudentServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.security.RunAs;
import java.util.List;

@SpringBootTest
class ZhiqaingApplicationTests {


//    @Test
//    void contextLoads() {
//
//
//        StudentService studentService = new StudentServiceImpl();
//        List<Student> allStudent = (List<Student>) studentService.findAllStudent();
//        allStudent.stream().forEach(System.out::println);
//    }

}
