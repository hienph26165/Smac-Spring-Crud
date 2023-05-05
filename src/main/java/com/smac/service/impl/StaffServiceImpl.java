package com.smac.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smac.repository.HelpRepository;
import com.smac.repository.StaffRepository;
import com.smac.service.StaffService;
import com.smac.dto.HelpDto;
import com.smac.dto.StaffDto;
import com.smac.entity.Help;
import com.smac.entity.Staff;

@Service
public class StaffServiceImpl implements StaffService{
	@Autowired
    private StaffRepository staffRepo;

    @Autowired
    private HelpRepository helpRepo;

    /**
     *
     * @return
     */
    @Override
    public List<StaffDto> getAll() {
        List<Staff> lstStaff = staffRepo.findAll();
        List<StaffDto> staffDTOs = new ArrayList<>();
        for (Staff staff : lstStaff) {
            List<Help> helpListByStaffCode = helpRepo.findByCreatedUser(staff.getStaffCode());
            staff.setHelps(helpListByStaffCode);

            for (Help help : helpListByStaffCode) {
                StaffDto staffDto = new StaffDto();
                staffDto.setStaffCode(staff.getStaffCode());
                staffDto.setStaffName(staff.getStaffName());
                staffDto.setTel(staff.getStaffName());
                staffDto.setShopId(staff.getShopId());
                staffDto.setIdNo(staff.getIdNo());
                staffDto.setHelpId(help.getHelpId());
                staffDTOs.add(staffDto);
            }
        }
        return staffDTOs;
    }
    
    
    @Override
    public List<HelpDto> getAllHelps() {
        List<Staff> staffs = staffRepo.findAll();
        List<HelpDto> helpDtos = new ArrayList<>();
        for (Staff staff : staffs) {
            List<Help> helps = helpRepo.findByCreatedUser(staff.getStaffCode());
            for (Help help : helps) {
                HelpDto helpDto = new HelpDto();
                helpDto.setParentHelpId(help.getParent());
                helpDto.setShopId(staff.getShopId());
                helpDto.setStaffId(staff.getStaffId());
                helpDto.setStatus(help.getStatus());
                helpDto.setType(help.getType());
                helpDtos.add(helpDto);
            }
        }
        return helpDtos;
    }

}
