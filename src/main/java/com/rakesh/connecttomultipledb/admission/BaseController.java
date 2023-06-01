/*
 * package com.rakesh.connecttomultipledb.admission;
 * 
 * import java.util.List; import java.util.stream.Collectors; import
 * java.util.stream.Stream;
 * 
 * import javax.annotation.PostConstruct;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.rakesh.connecttomultipledb.appointment.Appointment; import
 * com.rakesh.connecttomultipledb.appointment.AppointmentRepository;
 * 
 * @RestController public class BaseController {
 * 
 * 
 * @Autowired private AdmissionRepository admissionRepository;
 * 
 * @Autowired private AppointmentRepository appointmentRepository;
 * 
 *//******************************************************************************
	 * Home
	 ******************************************************************************/
/*
 * @GetMapping("/test") public String test(){ return "test sucess"; }
 *//******************************************************************************
	 * ENDPOINTS FOR ADMISSION SERVICE
	 ******************************************************************************/
/*
 * @PostConstruct public void addAdmissionsData() {
 * admissionRepository.saveAll(Stream.of( new Admission(101,
 * "A man needing surgery"), new Admission(102, "Nursing mum and baby"))
 * .collect(Collectors.toList())); }
 * 
 * @GetMapping("/getAdmissions") public List<Admission> getAdmissions(){ return
 * admissionRepository.findAll(); }
 * 
 *//******************************************************************************
	 * ENDPOINTS FOR APPOINTMENTS SERVICE
	 ******************************************************************************//*
																					 * @PostConstruct public void
																					 * addAppointmentsData() {
																					 * appointmentRepository.saveAll(
																					 * Stream.of( new Appointment(101,
																					 * "Teh first appointment ever"),
																					 * new Appointment(102,
																					 * "Appointment with a Dentist"))
																					 * .collect(Collectors.toList())); }
																					 * 
																					 * @GetMapping("/getAppointments")
																					 * public List<Appointment>
																					 * getAppointmens(){ return
																					 * appointmentRepository.findAll();
																					 * }
																					 * 
																					 * }
																					 */