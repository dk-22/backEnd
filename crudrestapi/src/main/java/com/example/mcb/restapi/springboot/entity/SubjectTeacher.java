package com.example.mcb.restapi.springboot.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class SubjectTeacher {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long teacher_id;
	@ManyToOne(targetEntity = Subject.class)
    private Subject subject;
	@ManyToOne(targetEntity = Groups.class)
    private Groups group;
	
	public SubjectTeacher() {}

	public long getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Groups getGroup() {
		return group;
	}

	public void setGroup(Groups group) {
		this.group = group;
	}
	
	
}
