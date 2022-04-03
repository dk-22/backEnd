package com.example.mcb.restapi.springboot.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name="tbl_mark")
@Entity
@Setter
@Getter
@ToString
public class Mark {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private float mark;
    @ManyToOne(targetEntity = Subject.class, fetch=FetchType.EAGER)
    private Subject subject;
    @ManyToOne(targetEntity = Student.class, fetch=FetchType.EAGER)
    private Student student;

    public Mark() {
    }

    public long getMarkId() {
        return id;
    }

    public void setMarkId(int markId) {
        this.id = markId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
