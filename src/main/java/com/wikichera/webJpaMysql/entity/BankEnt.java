package com.wikichera.webJpaMysql.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "BANK")
public class BankEnt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "BANK_ID")
    private Long bankId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "IS_INTERNATIONAL")
    private boolean international;
    //    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdatedDate;
    @Column(name = "LAST_UPDATE_BY")
    private String lastUpdatedBy;
    //    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @Column(name = "CREATED_BY")
    private String createdBy;
    @ElementCollection
    @CollectionTable(name = "BANK_CONTACT", joinColumns = @JoinColumn(name = "BANK_ID"))
    @Column(name = "NAME")
    private List<String> contacts = new ArrayList<>();
    @Embedded
    Address address = new Address();
}


