package com.dsic.elections.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entities.Maejor;


@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface MaejorReposiotry extends JpaRepository<Maejor, Integer>{

}
