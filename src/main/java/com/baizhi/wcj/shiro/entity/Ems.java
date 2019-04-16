package com.baizhi.wcj.shiro.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_ems")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ems {
    @Id
    private Integer id;
    private String name;
    private Double salary;
    private Integer age;
}
