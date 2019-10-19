package com.wikichera.webJpaMysql.service.group;

import com.wikichera.webJpaMysql.repositories.GroupRepository;
import com.wikichera.webJpaMysql.service.subGroup.SubGroupProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public List<SubGroupProjection> getSubCategoriesOfParentCategoryById(Long id) {
        return groupRepository.getSubCategoriesOfParentCategoryById(id);
    }
}
