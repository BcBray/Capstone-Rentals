package com.Brandon.Rentals.Contoller;

import java.util.List;
import java.util.Optional;

import com.Brandon.Rentals.Domain.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.Brandon.Rentals.Exceptions.RecordNotFoundException;
import com.Brandon.Rentals.Service.Impl.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeMvcController 
{
	@Autowired
	EmployeeService service;

	@RequestMapping
	public String getAllEmployees(Model model) 
	{
		List<EmployeeEntity> list = service.getAllEmployees();

		model.addAttribute("employees", list);
		return "Table";
	}

	@RequestMapping(path = {"/edit", "/edit/{id}"})
	public String editEmployeeById(Model model, @PathVariable("id") Optional<Long> id) 
							throws RecordNotFoundException 
	{
		if (id.isPresent()) {
			EmployeeEntity entity = service.getEmployeeById(id.get());
			model.addAttribute("employee", entity);
		} else {
			model.addAttribute("employee", new EmployeeEntity());
		}
		return "Add";
	}
	
	@RequestMapping(path = "/delete/{id}")
	public String deleteEmployeeById(Model model, @PathVariable("id") Long id) 
							throws RecordNotFoundException 
	{
		service.deleteEmployeeById(id);
		return "redirect:/";
	}

	@RequestMapping(path = "/createEmployee", method = RequestMethod.POST)
	public String createOrUpdateEmployee(EmployeeEntity employee) 
	{
		service.createOrUpdateEmployee(employee);
		return "redirect:/";
	}
}
