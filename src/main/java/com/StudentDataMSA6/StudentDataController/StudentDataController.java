package com.StudentDataMSA6.StudentDataController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDataMSA6.StudentData.Model.StudentData;
import com.StudentDataMSA6.StudentData.Respository.StudentDataRepository;




@RestController

public class StudentDataController {
	@Autowired
	StudentDataRepository studentRepository;
	@GetMapping("/StudentDatasaved")
	@PostMapping("/StudentDatasaved")
	public String insertStudent(@RequestBody List<StudentData> student) {
		studentRepository.saveAll(student);
		return "your record saved sucessfully";
	}

}
