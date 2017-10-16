package edu.mum.mumsched.service;


import edu.mum.mumsched.domain.Student;

 public interface StudentService   {
	
	
	public void save(Student student);
	public Student getStudentById(Long id);
	public Student getStudentByEmail(String email);
	
	
	
		   
}
 
