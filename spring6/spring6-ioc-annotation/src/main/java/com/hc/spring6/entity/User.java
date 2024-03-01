package com.hc.spring6.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author HuangChi
 * @since 2024/2/21
 */

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
}
