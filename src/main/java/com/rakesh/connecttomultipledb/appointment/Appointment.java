package com.rakesh.connecttomultipledb.appointment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="appointment")
public class Appointment
{
    @Id
    private int id;
    private String status;
}
