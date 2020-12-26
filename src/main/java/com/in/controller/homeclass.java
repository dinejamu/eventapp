package com.in.controller;

import com.in.dao.eventdao;
import com.in.dao.userdao;
import com.in.model.Userdetails;
import com.in.model.event;
import com.in.repository.eventrepository;
import com.in.repository.userdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class homeclass {

    @Autowired
    private userdao dao;

    @Autowired
    private userdetails repo;

    @Autowired
    private eventdao edao;

    @Autowired
    private eventrepository erepo;
    @RequestMapping("")
    public String home(){

        return "login";
    }
    @RequestMapping(value = {"view"} , method = RequestMethod.GET)
    public ModelAndView findall(){
        ModelAndView mv=new ModelAndView("home");
        List<event> events = erepo.findAll();
        System.out.println(events);
        mv.addObject("event", events);
        return mv;
    }

    @RequestMapping("/registor")
    public ModelAndView reg(Userdetails userdetails, ModelAndView mv){
        mv.setViewName("home");
        Userdetails user=repo.findByUserid(userdetails.getUserid());
        System.out.println(userdetails.getEventname());
    if(user==null){
        userdetails.setIsactived(true);
        dao.insert(userdetails);
        mv.addObject("success","Registor success..");
    }
        else{
        mv.addObject("error","This userid Already Exits.");
        }
        return mv;
    }
    @RequestMapping("login")
    public ModelAndView login(ModelAndView mv, @RequestParam("uid") String userid,@RequestParam("pass") String password){
        try{
        Userdetails user=repo.findByUserid(userid);
        if(user.getPassword().matches(password) && user.getUserid().matches(userid)){
            mv.addObject("lsuccess","login success..");
            List<event> eventList=edao.select();
            mv.addObject("elist",eventList);
            mv.setViewName("view");

        }else {
            mv.setViewName("login");
            mv.addObject("lerror","Userid or Password is wrong..");
        }
                } catch (Exception e) {
            mv.setViewName("login");
            mv.addObject("error","user id is not found please registor first.");
            e.printStackTrace();
        }
        return mv;
    }


}
