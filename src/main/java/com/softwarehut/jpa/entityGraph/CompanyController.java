package com.softwarehut.jpa.entityGraph;

import com.softwarehut.jpa.entityGraph.model.Company;
import com.softwarehut.jpa.entityGraph.service.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company/")
public class CompanyController {

    @Autowired
    @Qualifier(value = "companyServiceEntityGraph")
    private CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "/withDepartments/{companyId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Company getCompanyWithDepartments(@PathVariable("companyId") Long companyId) {
        return companyService.getCompanyWithDepartments(companyId);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "/withDepartmentsAndEmployees/{companyId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Company getCompanyWithDepartmentsAndEmployees(@PathVariable("companyId") Long companyId) {
        return companyService.getCompanyWithDepartmentsAndEmployees(companyId);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "/withDepartmentsAndEmployeesAndOffices/{companyId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Company getCompanyWithDepartmentsAndEmployeesAndOffices(@PathVariable("companyId") Long companyId) {
        return companyService.getCompanyWithDepartmentsAndEmployeesAndOffices(companyId);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, path = "/withCars/{companyId}")
    @ResponseStatus(value = HttpStatus.OK)
    public Company getCompanyWithCars(@PathVariable("companyId") Long companyId) {
        return companyService.getCompanyWithCars(companyId);
    }

}