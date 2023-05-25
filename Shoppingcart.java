package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shoppingcart {
    @TableId(value = "ID")
    private Integer ID;
    private Integer GID;
    private Integer Gnum;
    private String Sprice;
}
