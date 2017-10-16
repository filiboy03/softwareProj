package edu.mum.mumsched.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.mumsched.domain.Student;
import edu.mum.mumsched.service.StudentService;

@Controller
public class StudentRegController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value={"/"},method=RequestMethod.GET)
	public String studentRegForm( @ModelAttribute("newstudent") Student student, Model model) {
		
   	    return "studentregform";
    }
	
	
	@RequestMapping(value={"/addnewstudent"}, method = RequestMethod.POST)
    public String registerStudent(@Valid @ModelAttribute("newstudent")Student student, BindingResult bindingresult, Model model) {
		
		if(bindingresult.hasErrors()){
			return "studentregform";
		}
		 
	//STUDENT SAVED IN PERSISTENCE
		studentService.save(student);
		
 	//GET STUDENT FROM PERSISTENCE	
 		model.addAttribute(studentService.getStudentByEmail(student.getEmail()));
          
   	return "addsuccess";
    }
}
