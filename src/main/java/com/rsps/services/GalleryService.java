package com.rsps.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsps.models.Gallery;
import com.rsps.repositories.GalleryRepository;

import java.util.List;

@Service

public class GalleryService {

    @Autowired
    private GalleryRepository galleryRepository;





    // GET ALL IMAGES

    public List<Gallery> getAllImages() {

        return galleryRepository.findAll();
    }





    // ADD IMAGE

    public Gallery addImage(Gallery gallery) {

        return galleryRepository.save(gallery);
    }





    // DELETE IMAGE

    public void deleteImage(Long id) {

        galleryRepository.deleteById(id);
    }
}