package com.rakesh.connecttomultipledb.admission;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Profile("admissions")
public interface AdmissionRepository extends JpaRepository<Admission, Integer> {
}