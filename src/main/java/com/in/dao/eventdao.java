package com.in.dao;

import com.in.model.event;
import com.in.repository.eventrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class eventdao {
    @Autowired
    private eventrepository erepo;

    public void einsert(event eve) {
        erepo.save(eve);
    }

    public List<event> select() {

        return erepo.findAll();
    }
}
