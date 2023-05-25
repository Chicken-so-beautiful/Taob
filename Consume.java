package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consume {
    @TableId(value = "ID")
    private Integer ID;
    private DateTimeLiteralExpression.DateTime Time;
    private Integer GID;
    private Integer num;
    private Integer Allprice;
}
