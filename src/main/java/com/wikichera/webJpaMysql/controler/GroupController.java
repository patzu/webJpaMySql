package com.wikichera.webJpaMysql.controler;

import com.wikichera.webJpaMysql.service.group.GroupService;
import com.wikichera.webJpaMysql.service.subGroup.SubGroupProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/group/")
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping("/groupList/{id}")
    public List<SubGroupProjection> getGroupList(@PathVariable Long id){
        return groupService.getSubCategoriesOfParentCategoryById(id);
    }
}
