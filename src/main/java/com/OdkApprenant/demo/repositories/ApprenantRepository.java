package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkApprenant.demo.model.Apprenant;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {


}
