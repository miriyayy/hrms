package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionService;

import kodlamaio.hrms.entities.concretes.JobPosition;
import kodlamaio.hrms.business.abstracts.JobPositionService;




@RestController
@RequestMapping("/api/job_positions")
public class JobPositionController {
	
	private JobPositionService jobPositionService;
	
	@Autowired
	public JobPositionController(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
		
	}
	@GetMapping("/getall")
	public List<JobPosition> getAll() {
   return this.jobPositionService.getAll();
	}
}
