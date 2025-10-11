package com.support.UserInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private int userid;
    private String username;
    private String userpassword;
    private String address;
    private String city;

}
