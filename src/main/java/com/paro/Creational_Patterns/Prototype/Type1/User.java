package com.paro.Creational_Patterns.Prototype.Type1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String username;
    private String level;
    private AccessControl accessControl;


}
