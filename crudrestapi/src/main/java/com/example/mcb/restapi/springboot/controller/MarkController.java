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

import com.example.mcb.restapi.springboot.entity.Mark;
import com.example.mcb.restapi.springboot.repository.IMarkRepo;

@RestController
public class MarkController {

    @Autowired
    IMarkRepo markRepo;

    @GetMapping(value = "/mark")
    public ResponseEntity<List<Mark>> showAllMarks() {
        return ResponseEntity.ok(markRepo.findAll());
    }

    @GetMapping(value = "/mark/{id}")
    public Mark markById(@PathVariable long id) {
        return markRepo.findById(id).get();
    }

    @PostMapping(value = "/postmark")
    public void addmark(@RequestBody Mark mark){ markRepo.save(mark);}

    @DeleteMapping(value = "/mark/{id}")
    public void deleteMark(@PathVariable long id) { markRepo.deleteById(id); }
}
