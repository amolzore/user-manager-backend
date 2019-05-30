package com.amolzore.cloud.usermanager.controller.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFilterBody {
    String id;
    String username;
    String password;
}