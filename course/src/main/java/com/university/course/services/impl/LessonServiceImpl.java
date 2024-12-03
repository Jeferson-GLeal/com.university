package com.university.course.services.impl;

import com.university.course.repositories.LessonRepository;
import com.university.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements CourseService {

    @Autowired
    LessonRepository lessonRepository;
}
