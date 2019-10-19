package com.wikichera.webJpaMysql.service.bank;


import com.wikichera.webJpaMysql.entity.Address;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BankDto {
    private Long bankId;
    private String name;
    private boolean international;
    private Date lastUpdatedDate;
    private String lastUpdatedBy;
    private Date createdDate;
    private String createdBy;
    private Address address;
    private List<String> contacts;
}
