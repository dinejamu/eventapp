package com.in.dao;

import com.in.model.Userdetails;
import com.in.model.event;
import com.in.repository.eventrepository;
import com.in.repository.userdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class userdao {

    @Autowired
    private userdetails userrepo;


    public void insert(Userdetails userdetails) {
        userrepo.save(userdetails);
    }


}
