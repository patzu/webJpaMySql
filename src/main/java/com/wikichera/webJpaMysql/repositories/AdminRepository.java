package com.wikichera.webJpaMysql.repositories;

import com.wikichera.webJpaMysql.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
    List<Admin> findByUserName(String name);
}
