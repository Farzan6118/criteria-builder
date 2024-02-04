package com.example.criteriabuilder.service;

import com.example.criteriabuilder.model.Employee;
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

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Employee criteriaSampleOne() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Object> criteriaQuery = criteriaBuilder.createQuery();
        Root<Employee> from = criteriaQuery.from(Employee.class);
        //select all records
        System.out.println("Select all records");
        CriteriaQuery<Object> select = criteriaQuery.select(from);
        TypedQuery<Object> typedQuery = entityManager.createQuery(select);
        List<Object> resultlist = typedQuery.getResultList();

        for (Object o : resultlist) {
            Employee e = (Employee) o;
            System.out.println("ID : " + e.getId() + " firstName : " + e.getFirstName());
        }

        //Ordering the records
        System.out.println("Select all records by follow ordering");
        CriteriaQuery<Object> select1 = criteriaQuery.select(from);
        select1.orderBy(criteriaBuilder.asc(from.get("firstName")));
        TypedQuery<Object> typedQuery1 = entityManager.createQuery(select);
        List<Object> resultlist1 = typedQuery1.getResultList();

        for (Object o : resultlist1) {
            Employee e = (Employee) o;
            System.out.println("ID : " + e.getId() + " firstName : " + e.getFirstName());
        }
        entityManager.close();
        return null;
    }
}
