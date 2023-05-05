package com.smac.dto;

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
public class HelpDto {
	
    private Integer staffId;

    private Long parentHelpId;

    private String status;

    private String type;

    private Integer shopId;

	

    
    

}
