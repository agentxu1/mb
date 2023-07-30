package com.xys.mb.entities;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
public class BaseEntity implements Serializable {
    private Long id;
    private Timestamp createTime;
    private Timestamp updateTime;
}
