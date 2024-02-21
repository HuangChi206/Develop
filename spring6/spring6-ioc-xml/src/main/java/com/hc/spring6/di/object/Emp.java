package com.hc.spring6.di.object;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author HuangChi
 * @since 2024/2/6
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private String name;
    private Integer age;
    private Dept dept;
    private String[] hobby;
}
