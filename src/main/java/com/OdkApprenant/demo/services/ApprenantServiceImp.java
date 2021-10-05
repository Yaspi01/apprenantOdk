package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApprenantServiceImp implements ApprenantService{

    @Autowired
    ApprenantRepository apprenantRepository;
    @Override
    public Apprenant ajouter_apprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant modifier_apprenant(Long id, Apprenant apprenant) {
        Apprenant apprenantExistant = apprenantRepository.findById(id).get();
        apprenantExistant.setNom(apprenant.getNom());
        apprenantExistant.setPrenom(apprenant.getPrenom());
        apprenantExistant.setAge(apprenant.getAge());
        apprenantExistant.setGenre(apprenant.getGenre());
        apprenantExistant.setEmail(apprenant.getEmail());
        apprenantExistant.setLogin(apprenant.getLogin());
        apprenantExistant.setPassword(apprenant.getPassword());
        apprenantExistant.setTelephone(apprenant.getTelephone());
        apprenantExistant.setApprenantStatut(apprenant.getApprenantStatut());
        apprenantExistant.setDateCreation(apprenant.getDateCreation());
        apprenantExistant.setDateModification(apprenant.getDateModification());
        return apprenantRepository.save(apprenantExistant);
    }

    @Override
    public List<Apprenant> liste_apprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant afficher_apprenant_by_id(Long id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public void supprimer_apprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

}
