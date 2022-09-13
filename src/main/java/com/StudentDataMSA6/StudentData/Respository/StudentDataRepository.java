package com.StudentDataMSA6.StudentData.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentDataMSA6.StudentData.Model.StudentData;



public interface StudentDataRepository extends JpaRepository<StudentData, Long> {

}
