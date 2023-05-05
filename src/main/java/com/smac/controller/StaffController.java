package com.smac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smac.dto.HelpDto;
import com.smac.dto.StaffDto;
import com.smac.service.StaffService;

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

    @Autowired
    private StaffService staffService;

    /**
     *
     * @return
     */
    @GetMapping("/list")
    public List<StaffDto> getAll() {
        List<StaffDto> staffDtos = staffService.getAll();
        return staffDtos;
    }
    
    @GetMapping("/list2")
    public List<HelpDto> getAll1() {
        List<HelpDto> helpDtos = staffService.getAllHelps();
        return helpDtos;
    }
    
    

}

