package com.damm.admin.controller;

import com.alibaba.fastjson2.JSON;
import com.damm.admin.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author 黄林强
 * @ClassName UserController
 * @description: TODO
 * @date 2024年03月02日
 * @version: 1.0
 */
@Api(tags = "用户控制器")
@RequestMapping("/api/v1/user/")
@RestController
public class UserController {

    @ApiOperation("前端查询接口")
    @PostMapping("/create")
    public String create(@RequestBody UserDTO userDTO) {
        return JSON.toJSONString(userDTO);
    }

    @ApiOperation("前端查询接口")
    @GetMapping("/query")
    public String query() {
        return "hello";
    }
}
