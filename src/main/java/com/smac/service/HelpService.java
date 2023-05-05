package com.smac.service;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.smac.dto.HelpDto;
import com.smac.entity.Help;

import jakarta.validation.Valid;

public interface HelpService {

	List<Help> getAll();

	Boolean update(long helpId, Help help) throws Exception;
	
	Boolean updateStatus(long helpId) throws Exception;

	Boolean delete(long helpId) throws Exception;

	Boolean create(@Valid Help help) throws Exception;

}
