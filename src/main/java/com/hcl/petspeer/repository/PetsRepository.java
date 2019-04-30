package com.hcl.petspeer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.petspeer.entity.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets, Long> {

}
