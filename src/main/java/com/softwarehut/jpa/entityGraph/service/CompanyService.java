package com.softwarehut.jpa.entityGraph.service;

import com.softwarehut.jpa.entityGraph.model.Company;

public interface CompanyService {

    Company getCompanyWithDepartments(Long companyId);

    Company getCompanyWithDepartmentsAndEmployees(Long companyId);

    Company getCompanyWithDepartmentsAndEmployeesAndOffices(Long companyId);

    Company getCompanyWithCars(Long companyId);
}
