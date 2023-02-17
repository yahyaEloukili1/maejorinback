package com.dsic.elections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import com.dsic.elections.dao.MaejorReposiotry;
import com.dsic.elections.entities.AppRole;
import com.dsic.elections.entities.AppUser;
import com.dsic.elections.entities.Maejor;
import com.dsic.elections.services.AccountService;

@SpringBootApplication
public class Lmaejorin1Application implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	@Autowired
	private MaejorReposiotry electionRepository;
	@Autowired
	private MaejorReposiotry maejorReposiotry;
	@Autowired
	@Lazy
	private AccountService accountService;
	@Bean
	public BCryptPasswordEncoder getBPE() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(Lmaejorin1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Maejor.class);
		if(accountService.finduserByUsrname("rnpPdi")==null) {
			accountService.save(new AppUser(null,"rnpPdi","Laayoune2022@",null,null));
			accountService.saveRole(new AppRole(null,"ADMIN"));
			accountService.saveRole(new AppRole(null,"USER"));
			accountService.addRoleToUser("rnpPdi","ADMIN");
			accountService.addRoleToUser("rnpPdi","USER");
	
		for(int i=1;i<6;i++) {
			maejorReposiotry.save(new Maejor(i));
		}
		}
		
		
		
	}

}
