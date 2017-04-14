package com.softwarehut.jpa.entityGraph.service;

import com.softwarehut.jpa.entityGraph.model.Company;

import org.springframework.dao.support.DataAccessUtils;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Service(value = "companyServiceNamedQuery")
public class CompanyServiceNamedQueryImpl implements CompanyService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Company getCompanyWithDepartments(Long companyId) {
        Query query = entityManager.createNamedQuery("companyWithDepartmentsNamedQuery")
                .setParameter("id", companyId);

        return (Company) DataAccessUtils.singleResult(query.getResultList());
    }

    @Override
    public Company getCompanyWithDepartmentsAndEmployees(Long companyId) {
        Query query = entityManager.createNamedQuery("companyWithDepartmentsAndEmployeesNamedQuery")
                .setParameter("id", companyId);

        return (Company) DataAccessUtils.singleResult(query.getResultList());
    }

    @Override
    public Company getCompanyWithDepartmentsAndEmployeesAndOffices(Long companyId) {
        Query query = entityManager.createNamedQuery("companyWithDepartmentsAndEmployeesAndOfficesNamedQuery")
                .setParameter("id", companyId);

        return (Company) DataAccessUtils.singleResult(query.getResultList());
    }

    @Override
    public Company getCompanyWithCars(Long companyId) {
        Query query = entityManager.createNamedQuery("companyWithCarsNamedQuery")
                .setParameter("id", companyId);

        return (Company) DataAccessUtils.singleResult(query.getResultList());
    }
}
