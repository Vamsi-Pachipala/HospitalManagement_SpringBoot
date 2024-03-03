package com.example.HospitalManagementSystem;

public class Patient {
    private int patientId;
    private String name;
    private int age;
    private String decease;

    public Patient(int patientId, String name, int age, String decease) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.decease = decease;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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

    public String getDecease() {
        return decease;
    }

    public void setDecease(String decease) {
        this.decease = decease;
    }
}
