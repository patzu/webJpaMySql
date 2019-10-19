package com.wikichera.webJpaMysql.repositories;

import com.wikichera.webJpaMysql.entity.GroupEnt;
import com.wikichera.webJpaMysql.entity.SubGroupEnt;
import com.wikichera.webJpaMysql.service.group.GroupService;
import com.wikichera.webJpaMysql.service.subGroup.SubGroupDto;
import com.wikichera.webJpaMysql.service.subGroup.SubGroupProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GroupRepository extends JpaRepository<GroupEnt, Long> {
    @Query(value = "Select sg.*\n" +
            "from group_table g\n" +
            "         inner join sub_group sg on g.group_id = sg.sg_group_id\n" +
            "where g.group_id = :groupId", nativeQuery = true)
    List<SubGroupProjection> getSubCategoriesOfParentCategoryById(@Param("groupId") Long id);
}
