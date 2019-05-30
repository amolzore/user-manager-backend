package com.amolzore.cloud.usermanager.dataaccess.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private long id;
    private String username;
    private String password;
}
