package com.smac.service;

import java.util.List;

import com.smac.dto.HelpDto;
import com.smac.dto.StaffDto;
import com.smac.entity.Help;

public interface StaffService {
	
	 List<StaffDto> getAll();
	
     List<HelpDto> getAllHelps();

}
