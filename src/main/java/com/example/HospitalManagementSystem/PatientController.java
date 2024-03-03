package com.example.HospitalManagementSystem;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class PatientController {

    HashMap<Integer,Patient> patientDb = new HashMap<>();

    @PostMapping("/registerPatient")
    public String registerPatient(@RequestParam("patientId")Integer patientId ,@RequestParam("name")String name,
                                  @RequestParam("age")Integer age,@RequestParam("decease") String decease){
        Patient newPatient = new Patient(patientId,name,age,decease);
        patientDb.put(patientId,newPatient);
        return "Patient added Successfully";
    }

    @GetMapping("getPatient")
    public Patient getPatient(@RequestParam("patientId")Integer patientId){
        return patientDb.get(patientId);
    }

    @PostMapping("/registerPatientByBody")
    public String registerPatientByBody(@RequestBody Patient patient){
        patientDb.put(patient.getPatientId(),patient);
        return "added successfully using object";
    }

    @GetMapping("/getAllPatientsDetails")
    public List<Patient> getAllPatientsDetails(){
        List<Patient> patientList = new ArrayList<>();
        for(Patient p : patientDb.values()){
            patientList.add(p);
        }
        return patientList;
    }
}
