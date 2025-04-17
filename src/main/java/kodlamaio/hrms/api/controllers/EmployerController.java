package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.entities.concretes.Employer;

@RestController //springe rest api oldugunu söyler
@RequestMapping("/api/employers") //bu controllerın endpointlerinin "/api/employers" başlayacağını beliritr
public class EmployerController {
private EmployerService employerService;

@Autowired //Springin otomatik olarak EmployerServici enjekte etmesini sağlıyor
public EmployerController(EmployerService employerService) {
	this.employerService=employerService;
	
}
@GetMapping("/getall") //işverenleri listelemek için
public List<Employer> getAll(){
	return this.employerService.getAll();
}

@PostMapping("/add") //yeni işveren eklemek için
public void add(@RequestBody Employer employer) {
	System.out.println(">> companyName = " + employer.getCompanyName());
    System.out.println(">> industry = " + employer.getIndustry());
	this.employerService.add(employer);
}
}
