package com.smac.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.smac.entity.Help;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StaffDto {
	
    private String staffCode;
    
    private String staffName;
    
    private String tel;
    
    private String status;
    
    private Integer shopId;
    
    private Long helpId;
    
    private String idNo;
    
    
}
