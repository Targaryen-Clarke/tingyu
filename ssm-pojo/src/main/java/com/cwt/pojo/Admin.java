package com.cwt.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Admin {
    private Integer aid;
    private String aname;
    private String apwd;
    private String aphone;
    private LocalDate starttime;

}
