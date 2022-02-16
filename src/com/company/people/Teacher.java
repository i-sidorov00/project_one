package com.company.people;

public class Teacher extends People{
    private String middleName;
    private String kafedra;
    private String post;

    public Teacher(String firstName, String lastName, int age,String middleName) {
        super(firstName, lastName, age);
        this.middleName=middleName;
    }

    public Teacher(String firstName, String lastName, int age,String middleName,String kafedra, String post) {
        super(firstName, lastName, age);
        this.middleName=middleName;
        this.kafedra = kafedra;
        this.post = post;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Кафедра: " + kafedra);
        System.out.println("Должность: " + post);
        System.out.println("-------------------------------");
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getKafedra() {
        return kafedra;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
