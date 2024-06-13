package zuper.programmer.application;

import zuper.programmer.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Zuper Programmer");

        Company.Employee employee = company. new Employee();
        employee.setName("Umam");

        System.out.println(company.getName());
        System.out.println(employee.getName());

        Company company2 = new Company();
        company2.setName("Tidak Ada");

        Company.Employee employee2 = company2. new Employee();
        employee2.setName("Budi");

        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
