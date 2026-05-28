package com.rsps.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rsps.models.Notice;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long>  {

}
