package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.OdkApprenant.demo.model.Apprenant;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {

    Optional<Apprenant> getUserByLoginAndPassword(@Param("login")String login, @Param("password")String password);

}
