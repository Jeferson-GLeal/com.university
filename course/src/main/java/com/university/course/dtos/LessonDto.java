package com.university.course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class LessonDto{

    @NotBlank
    private String title;
    private String description;
    @NotBlank
    private String videoUrl;
}
