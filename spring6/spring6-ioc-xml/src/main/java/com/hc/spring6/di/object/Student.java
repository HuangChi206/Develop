package com.hc.spring6.di.object;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author HuangChi
 * @since 2024/2/18
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Map<Long,Teacher> teacherMap;
    private List<Lesson> lessonList;
}
