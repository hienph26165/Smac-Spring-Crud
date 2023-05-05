package com.smac.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smac.dto.HelpDto;
import com.smac.entity.Help;

@Repository
public interface HelpRepository extends JpaRepository<Help,Long>{

	@Query(value = "SELECT u FROM Help u where u.createdUser = ?1")
    List<Help> findByCreatedUser(String createdUser);
    
    @Query(nativeQuery = true, value = "select help_id from help start with help_id = ?1 connect by prior help_id = parent_help_id")
    List<Integer> selectHelpIdLevel(int helpId);
    
    @Query(nativeQuery = true, value = "update help set status = '0' where help_id = ?1")
    void delete(int helpId);

}