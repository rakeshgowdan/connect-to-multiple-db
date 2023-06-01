package com.rakesh.connecttomultipledb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.connecttomultipledb.admission.Admission;
import com.rakesh.connecttomultipledb.admission.AdmissionRepository;
import com.rakesh.connecttomultipledb.appointment.Appointment;
import com.rakesh.connecttomultipledb.appointment.AppointmentRepository;

@ComponentScan(basePackages = "{com.rakesh.connecttomultipledb.*}")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@RestController
public class ConnectToMultipleDbApplication {
	
	@Autowired
	private AdmissionRepository admissionRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;

	public static void main(String[] args) {
		SpringApplication.run(ConnectToMultipleDbApplication.class, args);
	}

	@GetMapping("/test")
	public String test(){
		return "test sucess";
	}
	/******************************************************************************
	 * ENDPOINTS FOR ADMISSION SERVICE
	 ******************************************************************************/
	@PostConstruct
	public void addAdmissionsData() {
			admissionRepository.saveAll(Stream.of(
					new Admission(101, "A man needing surgery"),
					new Admission(102, "Nursing mum and baby"))
					.collect(Collectors.toList()));
	}
	@GetMapping("/getAdmissions")
	public List<Admission> getAdmissions(){
		return admissionRepository.findAll();
	}
	/******************************************************************************
	 * ENDPOINTS FOR APPOINTMENTS SERVICE
	 ******************************************************************************/
	@PostConstruct
	public void addAppointmentsData() {
		appointmentRepository.saveAll(Stream.of(
				new Appointment(101, "Teh first appointment ever"),
				new Appointment(102, "Appointment with a Dentist"))
				.collect(Collectors.toList()));
	}
	@GetMapping("/getAppointments")
	public List<Appointment> getAppointmens(){
		return appointmentRepository.findAll();
	}
}
