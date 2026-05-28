package com.rsps.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsps.models.Notice;
import com.rsps.services.NoticeService;

@RestController
@RequestMapping("/api/notices")
@CrossOrigin("*")
public class NoticeController {
	
	@Autowired
    private NoticeService noticeService;



	  // GET ALL NOTICES

    @GetMapping

    public List<Notice> getAllNotices(){

        return noticeService.getAllNotices();
    }





    // ADD NOTICE

    @PostMapping

    public Notice addNotice(
            @RequestBody Notice notice){

        return noticeService.addNotice(notice);
    }





    // UPDATE NOTICE

    @PutMapping("/{id}")

    public Notice updateNotice(

            @PathVariable Long id,

            @RequestBody Notice updatedNotice){

        return noticeService.updateNotice(
                id,
                updatedNotice
        );
    }





    // DELETE NOTICE

    @DeleteMapping("/{id}")

    public void deleteNotice(
            @PathVariable Long id){

        noticeService.deleteNotice(id);
    }
    

}
