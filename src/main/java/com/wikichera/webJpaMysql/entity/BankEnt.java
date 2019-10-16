package com.wikichera.webJpaMysql.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "BANK")
@Entity
public class BankEnt {
    @Id
    @GeneratedValue
    @Column(name = "BANK_ID")
    private Long bankID;
    @Column(name = "NAME")
    private String name;
    @Column(name = "IS_INTERNATIONAL")
    private boolean international;
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdatedDate;
    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdatedBy;
    @Column(name="CREATED_DATE")
    private Date createdDate;
    @Column(name="CREATED_BY")
    private String createdBy;
    @Column(name="CONTACTS")
    private Map<String, String> contacts = new HashMap<String, String>();


}
