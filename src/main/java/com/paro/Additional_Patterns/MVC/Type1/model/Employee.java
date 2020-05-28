package com.paro.Additional_Patterns.MVC.Type1.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {
    private String employeeName;
    private String employeeId;
}
