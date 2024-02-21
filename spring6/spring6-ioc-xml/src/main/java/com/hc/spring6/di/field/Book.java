package com.hc.spring6.di.field;

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
public class Book {
    private String title;
    private String author;
    private String other;
}
