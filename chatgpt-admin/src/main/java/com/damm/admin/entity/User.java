package com.damm.admin.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.io.Serializable;

/**
 * (User)实体类
 * @since 2024-03-02 23:38:30
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -62150331852005101L;
    
    private Long id;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String pwd;
    /**
     * 逻辑删除0：不删除，1：删除
     */
    private Integer ld;
    /**
     * 创建者ID
     */
    private String creator;
    /**
     * 创建者姓名
     */
    private String creatorName;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 修改者ID
     */
    private String modifier;
    /**
     * 修改者姓名
     */
    private String modifierName;
    /**
     * 修改时间
     */
    private Timestamp modifyTime;
}

