package com.softwarehut.jpa.entityGraph.service;

import com.softwarehut.jpa.entityGraph.model.Company;
import com.softwarehut.jpa.entityGraph.model.Company_;
import com.softwarehut.jpa.entityGraph.model.Department;
import com.softwarehut.jpa.entityGraph.model.Department_;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Fetch;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Service(value = "companyServiceCriteriaAPI")
public class CompanyServiceCriteriaAPIImpl implements CompanyService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Company getCompanyWithDepartments(Long companyId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Company> query = builder.createQuery(Company.class);

        Root<Company> root = query.from(Company.class);
        root.fetch(Company_.departments, JoinType.LEFT);

        query.select(root).distinct(true);
        Predicate idPredicate = builder.equal(root.get(Company_.id), companyId);
        query.where(builder.and(idPredicate));

        return DataAccessUtils.singleResult(entityManager.createQuery(query).getResultList());
    }

    @Override
    public Company getCompanyWithDepartmentsAndEmployees(Long companyId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Company> query = builder.createQuery(Company.class);

        Root<Company> root = query.from(Company.class);
        Fetch<Company, Department> departmentFetch = root.fetch(Company_.departments, JoinType.LEFT);
        departmentFetch.fetch(Department_.employees, JoinType.LEFT);

        query.select(root).distinct(true);
        Predicate idPredicate = builder.equal(root.get(Company_.id), companyId);
        query.where(builder.and(idPredicate));

        return DataAccessUtils.singleResult(entityManager.createQuery(query).getResultList());
    }

    @Override
    public Company getCompanyWithDepartmentsAndEmployeesAndOffices(Long companyId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Company> query = builder.createQuery(Company.class);

        Root<Company> root = query.from(Company.class);
        Fetch<Company, Department> departmentFetch = root.fetch(Company_.departments, JoinType.LEFT);
        departmentFetch.fetch(Department_.employees, JoinType.LEFT);
        departmentFetch.fetch(Department_.offices, JoinType.LEFT);

        query.select(root).distinct(true);
        Predicate idPredicate = builder.equal(root.get(Company_.id), companyId);
        query.where(builder.and(idPredicate));

        return DataAccessUtils.singleResult(entityManager.createQuery(query).getResultList());
    }

    @Override
    public Company getCompanyWithCars(Long companyId) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Company> query = builder.createQuery(Company.class);

        Root<Company> root = query.from(Company.class);
        root.fetch(Company_.cars, JoinType.LEFT);

        query.select(root).distinct(true);
        Predicate idPredicate = builder.equal(root.get(Company_.id), companyId);
        query.where(builder.and(idPredicate));

        return DataAccessUtils.singleResult(entityManager.createQuery(query).getResultList());
    }
}
