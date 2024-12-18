package com.university.course.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serializable;

@Data
public class ModuleDto {

    @NotBlank
    private String title;
    @NotBlank
    private String description;


}
