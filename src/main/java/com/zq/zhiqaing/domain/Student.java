package com.zq.zhiqaing.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : BZQ
 * @Date: 2021/7/25 19:13
 * @Description :
 */

@SuppressWarnings("all")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String sname;
    private Integer sid;
    private String ssex;
    private Integer sage;
}
