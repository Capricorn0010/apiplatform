package com.chant.apiplatform.entity;

import com.chant.apiplatform.enums.RoleEnum;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 实体： 用户
 *
 * Author: 郑楷山
 * Date: 2019-08-29
 **/
@Accessors(chain = true)
@Data
public class User {

    private String name;

    private String password;

    private String email;
    private RoleEnum role;

}
