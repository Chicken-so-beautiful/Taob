package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    @TableId(value = "GID")
    private Integer GID;
    private String Gname;
    private Integer Gprice;
    private Integer Greserve;
    private Integer Gcost;
    private String Gsupplier;
    private String  Gintrodecut;
    private String Gurl;
}
