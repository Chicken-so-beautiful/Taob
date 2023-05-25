package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    @TableId(value = "GID")
    private Integer GID;
    private Integer ID;
    private String Content;
    private DateTimeLiteralExpression.DateTime Ctime;
}
