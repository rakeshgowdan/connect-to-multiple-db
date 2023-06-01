package com.rakesh.connecttomultipledb.admission;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="admission")
@Profile("admissions")
public class Admission {
    @Id
    private int id;
    private String description;
}