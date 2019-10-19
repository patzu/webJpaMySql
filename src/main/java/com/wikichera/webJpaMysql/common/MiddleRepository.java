package com.wikichera.webJpaMysql.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * Created by t.makari on 5/23/2018.
 */
@NoRepositoryBean
public interface MiddleRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID> {

}