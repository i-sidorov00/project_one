package com.company.people;

public class Student extends People{

    private String group;
    private int kurs;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public Student (String firstName, String lastName, int age, String group, int kurs){
        super(firstName,lastName,age);
        this.group = group;
        this.kurs = kurs;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Группа: " + group);
        System.out.println("Курс: " + kurs);
        System.out.println("-------------------------------");
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

}
