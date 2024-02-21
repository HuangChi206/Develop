package com.hc.spring6.di.object;

import lombok.Data;

import java.util.List;

/**
 * @author HuangChi
 * @since 2024/2/6
 */

@Data
public class Dept {
    private String name;
    private List<Emp> empList;
}
