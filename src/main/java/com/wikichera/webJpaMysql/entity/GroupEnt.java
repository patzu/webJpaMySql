
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
@Table(name = "GROUP_TABLE")
public class GroupEnt {

    @Id
    @Column(name = "GROUP_ID")
    @GeneratedValue
    private Long id;

    @Column(name = "GROUP_NAME")
    private String groupName;
}