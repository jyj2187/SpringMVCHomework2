package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.MyClass;
import kr.ac.hansung.service.MyClassService;

@Controller
public class MyClassController {

	@Autowired
	private MyClassService myclassService;

	@RequestMapping("/semester")
	public String showSemester(Model model) {
		List<MyClass> myclass = myclassService.getCurrent();
		model.addAttribute("myclass", myclass);

		return "semester";
	}

	@RequestMapping("/semesterdetail")
	public String showSemesterdetail(Model model, Integer year, Integer semester) {
		List<MyClass> myclassd = myclassService.getCurrent2(year, semester);
		model.addAttribute("year", year);
		model.addAttribute("semester", semester);
		model.addAttribute("myclassd", myclassd);
		return "semesterdetail";
	}


	@RequestMapping("/registerclass")
	public String register(Model model) {
		return "registerclass";
	}


	@RequestMapping("/doregister")
	public String doRegister(Model model, MyClass myclass, BindingResult result) {
		myclassService.insert(myclass);
		return "classregistered"; 
	}

	@RequestMapping("/registeredclass")
	public String showRegisteredclass(Model model) {
		List<MyClass> registeredclass = myclassService.getregisteredclass();
		model.addAttribute("registeredclass", registeredclass);
		return "registeredclass";
	}

}