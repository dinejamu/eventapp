package com.in.controller;

import com.in.dao.eventdao;
import com.in.model.event;
import com.in.repository.eventrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class eventcontroller {

    @Autowired
    private eventdao edao;

    @Autowired
    private eventrepository erepo;

    @RequestMapping("evregistor")
    public ModelAndView eventreg(event eve, ModelAndView mv){
        mv.setViewName("event");
        if(eve!=null){
            System.out.println(eve);
            edao.einsert(eve);
            mv.addObject("esuccess","Event Registor success..");
        }
        else{
            mv.addObject("eerror","Try Again.");
        }
        return mv;
    }
}
