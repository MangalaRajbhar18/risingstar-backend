package com.rsps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsps.models.Gallery;


@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long>{

}
