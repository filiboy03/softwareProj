package edu.mum.mumsched.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.mumsched.dao.StrudentDao;
import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.service.StudentService;

@Service
public class StudentServiceImp implements StudentService  {
	
	@Autowired
	StrudentDao studentDAO;
	
	@Override
	public void save(Student student){
		studentDAO.save(student);
		return ;
	}

	@Override
	public Student getStudentByEmail(String email) {
		return studentDAO.findStudentByEmail(email);
	}

	@Override
	public Student getStudentById(Long studentId) {
		return studentDAO.findStudentById(studentId);
	}
	
	
		   
}
 
