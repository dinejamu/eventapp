package com.in.repository;

import com.in.model.Userdetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userdetails extends JpaRepository<Userdetails, Integer> {
    Userdetails findByUserid(String userid);
}
