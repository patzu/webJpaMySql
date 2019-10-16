package com.wikichera.webJpaMysql;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class GenericDAOService {
    @PersistenceContext
    private EntityManager entityManager;

    public <T> void insert(T entity) {
        entityManager.persist(entity);
    }

    public <T> void update(T entity) {
        entityManager.persist(entity);
    }
}
