package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @TableId(value = "ID")
    private Integer ID;
    private String name;
    private String password;
    private String url;

}
