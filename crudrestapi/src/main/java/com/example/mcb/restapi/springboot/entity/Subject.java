package com.example.mcb.restapi.springboot.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Subject {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	private String title;
	
	public Subject() {
		
	}
	
	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
