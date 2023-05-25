package com.example.keshe3.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCenter {
    @TableId(value="ID")
    private Integer ID;
    private String name;
    private Date Birthday;
    private String Sex;
    private String label;
    private String url;
    private String Address;
    private String Job;
}
