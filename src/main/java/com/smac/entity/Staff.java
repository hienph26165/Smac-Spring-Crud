package com.smac.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Table(name = "staff")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Staff {
    @Id
    @Column(name = "staff_id")
    private Integer staffId;

    @Column(name = "staff_code")
    private String staffCode;

    @Column(name = "staff_name")
    private String staffName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "address")
    private String address;

    @Column(name = "shop_id")   
    private Integer shopId;

    @Column(name = "id_no")
    private String idNo;

    @Column(name = "status")
    private String status;
    
    
    @OneToMany(mappedBy = "createdUser", cascade = CascadeType.ALL)
    private List<Help> helps;


}
