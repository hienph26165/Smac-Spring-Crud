package com.smac.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;

import com.smac.dto.HelpDto;
import com.smac.dto.StaffDto;
import com.smac.entity.Help;
import com.smac.entity.Staff;
import com.smac.repository.HelpRepository;
import com.smac.service.HelpService;

import jakarta.validation.Valid;

@Service
public class HelpServiceImpl implements HelpService{
	
	@Autowired
    private HelpRepository helpRepo;

    @Override
    public List<Help> getAll() {
        List<Help> lstHelp = helpRepo.findAll();
        return lstHelp;
    }

    @Override
    public Boolean create(@Valid @RequestBody Help help) throws Exception {
    	helpRepo.save(help);
        return true;
    }

    @ExceptionHandler
    @Override
    public Boolean delete(long helpId) throws Exception {
    	List<Help> lstHelp = helpRepo.findAll();
    	for(Help help : lstHelp) {
    		if(help.getHelpId() == helpId) {
    			helpRepo.delete(help);
    			return true;
    		}
    	}
            return false;
    }


	@Override
	public Boolean update(long helpId,@Valid @RequestBody Help help) throws Exception {
        List<Help> lstHelp = helpRepo.findAll();
    	for(Help helps : lstHelp) {
    		if(helps.getHelpId() == helpId) {
    			helps.setContent(help.getContent());
    			helps.setCreatedUser(help.getCreatedUser());
    			helps.setParent(help.getParent());
//    			helps.setHelpId(help.getHelpId());
    			helps.setHelpName(help.getHelpName());
    			helps.setPosition(help.getPosition());
    			helps.setStatus(help.getStatus());
    			helps.setType(help.getType());
    	    	helpRepo.save(helps);
    	        return true;
    		}
    	}
            return false;
	}

	@Override
	public Boolean updateStatus(long helpId) throws Exception {
		List<Help> lstHelp = helpRepo.findAll();
    	for(Help helps : lstHelp) {
    		if(helps.getHelpId() == helpId) {
    			helps.setStatus("0");
    	    	helpRepo.save(helps);
    	        return true;
    		}
    	}
            return false;
	}


	
}
