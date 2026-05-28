package com.rsps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsps.models.Pamphlet;

@Repository
public interface PamphletRepository extends JpaRepository<Pamphlet,Long>{

}
