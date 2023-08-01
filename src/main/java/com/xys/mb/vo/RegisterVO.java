package com.xys.mb.vo;

import com.xys.mb.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterVO {
    String result;
    String message;
    User user;
}
