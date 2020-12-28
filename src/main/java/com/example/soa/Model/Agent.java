package com.example.soa.Model;

import javax.persistence.*;

@Entity
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;
    String name;
    String lastname;
    String job;

    public Agent(int id, String name, String lastname, String job) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.job = job;
    }

    public Agent() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
