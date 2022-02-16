package com.company.practiceCollections;

import java.util.*;

public class Company {
    private List<String> listOfEmployees;

    public static void main(String[] args) {
        Employee employee0 = new Employee("John", 25, "Sales manager", 1026.54,
                2018, Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment0 = employee0.getSalary() * Employee.specialAllowanceCounter(employee0.getYearOfJoin(),
                employee0.getCurrentYear()) + employee0.getSalary();

        Employee employee1 = new Employee("Jane", 23, "Sales manager", 890.96,
                2020, Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment1 = employee1.getSalary() * Employee.specialAllowanceCounter(employee1.getYearOfJoin(),
                employee1.getCurrentYear()) + employee1.getSalary();

        Employee employee2 = new Employee("Sara", 29, "Recruiter", 700, 2016,
                Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment2 = employee2.getSalary() * Employee.specialAllowanceCounter(employee2.getYearOfJoin(),
                employee2.getCurrentYear()) + employee2.getSalary();

        Employee employee3 = new Employee("Harry", 19, "Quidich player", 350, 2021,
                Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment3 = employee3.getSalary() * Employee.specialAllowanceCounter(employee3.getYearOfJoin(),
                employee3.getCurrentYear()) + employee3.getSalary();

        Employee employee4 = new Employee("Sven", 35, "Vikings designer", 620.45,
                2021, Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment4 = employee4.getSalary() * Employee.specialAllowanceCounter(employee4.getYearOfJoin(),
                employee4.getCurrentYear()) + employee4.getSalary();

        Employee employee5 = new Employee("Uthred", 35, "Head of the security department", 810.54,
                2015, Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment5 = employee5.getSalary() * Employee.specialAllowanceCounter(employee5.getYearOfJoin(),
                employee5.getCurrentYear()) + employee5.getSalary();

        Employee employee6 = new Employee("Leofrich", 40, "CEO", 3500, 2014,
                Employee.getSpecialAllowanceForYearOfWork(), 2022);
        double monthlyPayment6 = employee6.getSalary() * Employee.specialAllowanceCounter(employee6.getYearOfJoin(),
                employee6.getCurrentYear()) + employee6.getSalary();

        List<Employee> company = new ArrayList<Employee>();
        company.add(employee0);
        company.add(employee1);
        company.add(employee2);
        company.add(employee3);
        company.add(employee4);
        company.add(employee5);
        company.add(employee6);
        Map<Integer, Double> monthlyPayment = new HashMap<>();
        monthlyPayment.put(0, monthlyPayment0);
        monthlyPayment.put(1, monthlyPayment1);
        monthlyPayment.put(2, monthlyPayment2);
        monthlyPayment.put(3, monthlyPayment3);
        monthlyPayment.put(4, monthlyPayment4);
        monthlyPayment.put(5, monthlyPayment5);
        monthlyPayment.put(6, monthlyPayment6);
        int i = 0;
        for (Employee worker : company) {
            System.out.println(worker);
            System.out.printf("Monthly payment is : %.2f %c\n", monthlyPayment.get(i), '$');
            i++;
        }
        System.out.println();
    }
}

