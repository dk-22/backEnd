package com.example.mcb.restapi.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcb.restapi.springboot.entity.Groups;
import com.example.mcb.restapi.springboot.repository.IGroupsRepo;


@RestController
public class GroupsController {

    @Autowired
    IGroupsRepo groupRepo;

    @GetMapping(value = "/group")
    public ResponseEntity<List<Groups>> showAllGroups() {
        return ResponseEntity.ok(groupRepo.findAll());
    }

    @GetMapping(value = "/group/{id}")
    public Groups groupById(@PathVariable long id) {
        return groupRepo.findById(id).get();
    }

    @PostMapping(value = "/postgroup")
    public void addgroup(@RequestBody Groups groups){
        groups.getStudents().forEach(s -> s.setGroup(groups));
        groupRepo.save(groups);}

    @DeleteMapping(value = "/group/{id}")
    public void deleteGroup(@PathVariable long id) { groupRepo.deleteById(id); }
}
