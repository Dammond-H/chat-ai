package com.damm.admin.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author 黄林强
 * @ClassName UserDTO
 * @description: TODO
 * @date 2024年03月03日
 * @version: 1.0
 */
@Data
public class UserDTO implements Serializable {

    private final Long serialVersionUID = -1L;

    private String username;

    private String pwd;
}
