package com.xys.mb.entities;

import lombok.Data;

@Data
public class User extends BaseEntity{
    private String userName;
    private String password;
    private String email;
}
