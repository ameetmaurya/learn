package com.example.jpa_manytomany.entity;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Student_TBL")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class student {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int age;
    private String dept;

    
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="Student_Course_Table",

    joinColumns = {
        @JoinColumn(name="Student_id",referencedColumnName = "id")
    },
    inverseJoinColumns = {
        @JoinColumn(name="course_id",referencedColumnName = "id")
    }
    )
    

    private Set<course> course;


   

}
