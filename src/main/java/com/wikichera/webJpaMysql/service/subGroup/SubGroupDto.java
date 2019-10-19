package com.wikichera.webJpaMysql.service.subGroup;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class SubGroupDto {
    private Long sg_subgroup_id;
    private Long sg_group_id;
    private String sg_subgroup_name;
}
