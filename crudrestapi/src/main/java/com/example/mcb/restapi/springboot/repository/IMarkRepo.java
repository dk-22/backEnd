package com.example.mcb.restapi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mcb.restapi.springboot.entity.Mark;

@Repository
public interface IMarkRepo extends JpaRepository<Mark, Long> {

}
