package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Administrator {
    @TableId(value = "AID")
    private Integer AID;
    private String name;
    private String password;
    private String grade;
}
