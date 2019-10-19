
package com.wikichera.webJpaMysql.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@ToString
@Entity
@Table(name = "SubGroup")
public class SubGroupEnt {

    @Id
    @Column(name = "SG_SUBGROUP_ID")
    @GeneratedValue
    private Long id;

    @Column(name = "SG_GROUP_ID")
    private Long groupID;

    @Column(name = "SG_SUBGROUP_NAME")
    private String subGroupName;

}

