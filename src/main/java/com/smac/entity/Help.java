package com.smac.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Data
@Table(name = "HELP")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Help {
	@Id
	@Column(name = "HELP_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long helpId;
	
	@NotEmpty(message = "Không được trống helpname")
	@Column(name = "HELP_NAME")
	private String helpName;
	
	@Min(value=1, message="must be equal or greater than 1")  
    @Max(value=100, message="must be equal or less than 100")  
	@Column(name = "PARENT_HELP_ID")
	private Long parent;
	
	@NotEmpty(message = "Không được trống type")
	@Column(name = "TYPE")
	private String type;
	
	@NotEmpty(message = "Không được trống position")
	@Column(name = "POSITION")
	private String position;
	
	@NotEmpty(message = "Không được trống content")
	@Column(name = "CONTENT")
	private String content;
	
	@NotEmpty(message = "Không được trống createdUser")
	@Column(name = "CREATED_USER")
	private String createdUser;
	
	@NotEmpty(message = "Không được trống status")
	@Column(name = "STATUS")
	private String status;


}
