package com.example.mcb.restapi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mcb.restapi.springboot.entity.Groups;

@Repository
public interface IGroupsRepo extends JpaRepository<Groups, Long> {

}
