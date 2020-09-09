package com.monitored.springpharma.dao;
import org.springframework.data.repository.CrudRepository;
import com.monitored.springpharma.model.Patient;

public interface PatientDao extends CrudRepository<Patient, Integer> {

}