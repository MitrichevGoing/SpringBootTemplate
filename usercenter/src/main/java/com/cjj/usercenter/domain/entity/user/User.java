package com.cjj.usercenter.domain.entity.user;

import java.util.Date;
import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String username;

    private String email;

    private String password;

    @Column(name = "create_time")
    private Date createTime;
}