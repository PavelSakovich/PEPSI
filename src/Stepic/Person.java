package Stepic;

import java.util.List;

public class Person extends People{
    private String namePerson;
    private int age;
    private String nomer;
    private  String mail;
    private int postIndex;
    private String postAdres;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 && age > 150) {
            System.out.println("Вы ввели число не свойственное возрасту человека");
        } else {
            this.age = age;
        }
    }

    public String getNomer() {
        return nomer;
    }

    public void setNomer(String nomer) {
        this.nomer = nomer;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPostIndex() {
        return postIndex;
    }

    public void setPostIndex(int postIndex) {
        this.postIndex = postIndex;
    }

    public String getPostAdres() {
        return postAdres;
    }

    public void setPostAdres(String postAdres) {
        this.postAdres = postAdres;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }
}
