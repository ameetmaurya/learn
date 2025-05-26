package com.example.jpa_manytomany.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Course_TBL")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class course {
    @Id
    @GeneratedValue

    private long id;
    private String title;
    private String abbrevation;
    private int modules;
    private double fees;
     
    @ManyToMany(mappedBy = "course",fetch = FetchType.LAZY)
    private Set<student> students;
}
