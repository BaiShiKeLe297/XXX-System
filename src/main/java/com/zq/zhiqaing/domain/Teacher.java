package com.zq.zhiqaing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @Author : BZQ
 * @Date: 2021/8/4 21:15
 * @Description :
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Teacher {
    private String tname;
    private String tsex;
    private Integer tid;
    private Integer tage;
}
