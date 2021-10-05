package com.OdkApprenant.demo;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.ApprenantStatut;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class OdkApprenantsApplication {

	@Autowired
	private ApprenantRepository apprenantRepository;

	public static void main(String[] args) {
		SpringApplication.run(OdkApprenantsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ApprenantRepository apprenantRepository){
		return args -> {
			apprenantRepository.save(new Apprenant("Doumbia" ,"Yacouba",3,75900085, "Yacoubadoumbia@gmail.com",
					"Yacouba01", "azerty","Homme", ApprenantStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Apprenant("Diarra" ,"Dramane",3,75900085, "diarradramane@gmail.com",
					"Diarra", "azerty","Homme", ApprenantStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Apprenant("Sanogo" ,"Allassan",3,75900085, "sanogoallassa@gmail.com",
					"Jumeau", "azerty","Homme", ApprenantStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Apprenant("N'Djim" ,"Fatoumata",3,75900085, "ndjim@gmail.com",
					"N'djim", "azerty","Femme", ApprenantStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Apprenant("Keita" ,"Awa",3,75900085, "awakeita@gmail.com",
					"Awa", "azerty","Femme", ApprenantStatut.ACTIVE, new Date(), new Date()));
			apprenantRepository.save(new Apprenant("Sanogo" ,"Ibrahima",3,75900085, "ibrahimsanogo@gmail.com",
					"IB", "azerty","Homme", ApprenantStatut.DESACTIVE, new Date(), new Date()));
			apprenantRepository.findAll().forEach(apprenant -> {
				System.out.println(apprenant.toString());
			});
		};
	}
	/*@Override
	public void run(String... args) throws Exception {
		apprenantRepository.save(new Apprenant(1,"Doumbia" ,"Yacouba",3,75900085 ));
		apprenantRepository.save(new Apprenant(2,"Sanogo" ,"Allassan",4,75900000 ));
		apprenantRepository.save(new Apprenant(3,"Bagayoko" ,"Mamoutou",6,65900085 ));
		apprenantRepository.save(new Apprenant(4,"N'Djim" ,"Fatoumata",7,55900085 ));
		apprenantRepository.save(new Apprenant(5,"Cisse" ,"Thomad",8,85900085 ));
		apprenantRepository.save(new Apprenant(6,"Samake" ,"Modibo",9,95900085 ));
		apprenantRepository.save(new Apprenant(7,"Maiga" ,"Abdoul",10,15900085 ));
		apprenantRepository.save(new Apprenant(8,"Sanogo" ,"Ibrahima",11,25900085 ));*/
		


}
