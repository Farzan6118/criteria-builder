package com.example.criteriabuilder.service;

import com.example.criteriabuilder.model.Employee;
import jakarta.annotation.PreDestroy;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EntityManager entityManager;
    private final CriteriaBuilder criteriaBuilder;
    private final CriteriaQuery<Object> criteriaQuery;
    private final CriteriaQuery<Object> select;
    private final Root<Employee> from;

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
        criteriaBuilder = entityManager.getCriteriaBuilder();
        criteriaQuery = criteriaBuilder.createQuery();
        from = criteriaQuery.from(Employee.class);
        select = criteriaQuery.select(from);
    }

    public List<Object> criteriaSampleOne() {

        //select all records
        System.out.println("Select all records");
        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
        return typedQuery.getResultList();
    }

    public List<Object> criteriaSampleTwo() {

        //Ordering the records
        System.out.println("Select all records by follow ordering");
        CriteriaQuery<Object> select1 = criteriaQuery.select(from);
        select1.orderBy(criteriaBuilder.asc(from.get("salary")));
        TypedQuery<Object> typedQuery1 = entityManager.createQuery(select);
        return typedQuery1.getResultList();

    }

    @PreDestroy
    private void closeEntityManager() {
        entityManager.close();

    }
}
