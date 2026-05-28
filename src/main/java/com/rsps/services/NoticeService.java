package com.rsps.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsps.models.Notice;
import com.rsps.repositories.NoticeRepository;

@Service
public class NoticeService {
	
	@Autowired
    private NoticeRepository noticeRepository;



	 // GET ALL NOTICES

    public List<Notice> getAllNotices(){

        return noticeRepository.findAll();
    }





    // ADD NOTICE

    public Notice addNotice(Notice notice){

        return noticeRepository.save(notice);
    }





    // UPDATE NOTICE

    public Notice updateNotice(
            Long id,
            Notice updatedNotice){

        Notice notice =
        noticeRepository.findById(id)
        .orElseThrow();





        notice.setTitle(
        updatedNotice.getTitle());

        notice.setDescription(
        updatedNotice.getDescription());

        notice.setDate(
        updatedNotice.getDate());

        notice.setNoticeImage(
        updatedNotice.getNoticeImage());





        return noticeRepository.save(notice);
    }





    // DELETE NOTICE

    public void deleteNotice(Long id){

        noticeRepository.deleteById(id);
    }

}
