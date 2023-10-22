package com.example.todolist.pojo.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskByStatusDto {
    private String content;
    private LocalDateTime createTime;
    private Integer status;
}
