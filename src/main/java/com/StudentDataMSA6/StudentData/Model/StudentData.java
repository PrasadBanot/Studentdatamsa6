package com.StudentDataMSA6.StudentData.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")

public class StudentData{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String gender;
	private long age;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		gender = gender;
	}
	public long getage() {
		return age;
	}
	public void setPrice(long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
