package spring.boot.gradle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.jpa.User;
import spring.boot.jpa.UserRepository;

@Service
public class APIServiceImpl {
	
	@Autowired
	private APIRepositoryImpl repimpl;
	
	@Autowired
	private UserRepository jpaimpl;
	
	public String getDetails()
	{
		User user = new User();
		user.setName("evis");
		jpaimpl.save(user);
		return "sample";
	}
	
	public String getDetails2()
	{
		repimpl.getDetails();
		return "sample2";
	}

}
