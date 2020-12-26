package com.in.repository;

import com.in.model.event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface eventrepository extends JpaRepository<event, Integer> {


}
