package com.smac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smac.entity.Help;
import com.smac.repository.HelpRepository;
import com.smac.service.HelpService;

@RestController
@RequestMapping("/api")
public class HelpController {

	@Autowired
    private HelpService helpService;

    @GetMapping("/list")
    public List<Help> getAll() {
        return helpService.getAll();

    }

    @DeleteMapping("/delete/{helpId}")
    public Boolean delete(@PathVariable("helpId") long helpId) throws Exception {
        helpService.delete(helpId);
        return true;
    }
    
    @PostMapping("/add")
    public Boolean addHelp(@RequestBody Help help) throws Exception {
        // save the product to the database or perform other operations
    	 helpService.create(help);
        return true;
    }
    
    @PutMapping("/update/{helpId}")
    public Boolean updateHelp(@PathVariable("helpId") long helpId, @RequestBody Help help) throws Exception {
        // save the product to the database or perform other operations
        return helpService.update(helpId, help);
    }

    @PutMapping("/updateStatus/{helpId}")
    public Boolean updateStatusHelp(@PathVariable("helpId") long helpId) throws Exception {
		return helpService.updateStatus(helpId);
    }

}
