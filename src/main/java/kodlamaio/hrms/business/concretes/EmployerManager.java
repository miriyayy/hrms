package kodlamaio.hrms.business.concretes;

import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.dataAcces.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
private EmployerDao employerDao; //Dao sınıfı aracılığıyla veri tabanıyla etkileşim sağlanır

@Autowired
public EmployerManager(EmployerDao employerDao) {
	this.employerDao=employerDao;
}
@Override
public List<Employer> getAll(){ //getall tüm işverenleri listeler
	return this.employerDao.findAll();
}

@Override
public void add(Employer employer) {
	this.employerDao.save(employer);
}
/*
public Result add(Employer employer) {
	employer.setUserType("Employer");
	
	this.employerDao.save(employer);
	return new SuccessResult("employer added");
}*/
}
