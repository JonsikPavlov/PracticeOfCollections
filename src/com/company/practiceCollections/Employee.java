package com.company.practiceCollections;

public class Employee {
    /* Создать класс Employee и класс Company, который содержит список сотрудников.
     * Необходимо рассчитать выплаты заработной платы на месяц.
     * Поля и другие методы в Employee и Company продумать самим.*/

    private String name;
    private int age;
    private String position;
    private double salary;
    private int yearOfJoin;
    private static double SpecialAllowanceForYearOfWork = 0.1;
    private int currentYear;

    public Employee(String name, int age, String position, double salary, int yearOfJoin, double specialAllowanceForYearOfWork, int currentYear) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.yearOfJoin = yearOfJoin;
        SpecialAllowanceForYearOfWork = specialAllowanceForYearOfWork;
        this.currentYear = currentYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYearOfJoin() {
        return yearOfJoin;
    }

    public void setYearOfJoin(int yearOfJoin) {
        this.yearOfJoin = yearOfJoin;
    }

    public double getSPECIAL_ALLOWANCE_FOR_YEAR_OF_WORK() {
        return SpecialAllowanceForYearOfWork;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public static double getSpecialAllowanceForYearOfWork() {
        return SpecialAllowanceForYearOfWork;
    }

    public static void setSpecialAllowanceForYearOfWork(double specialAllowanceForYearOfWork) {
        SpecialAllowanceForYearOfWork = specialAllowanceForYearOfWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", yearOfJoin=" + yearOfJoin +
                ", SPECIAL_ALLOWANCE_FOR_YEAR_OF_WORK=" + SpecialAllowanceForYearOfWork +
                ", currentYear=" + currentYear +
                '}';
    }

    public static double specialAllowanceCounter(int yearOfJoin, int currantYear) {
        double specialAllowance = (currantYear - yearOfJoin) * SpecialAllowanceForYearOfWork;
        return specialAllowance;
    }

    public static double annualBonusCounter(double annualBonus, double salary){
       return annualBonus = salary/30*50;
    }

}
