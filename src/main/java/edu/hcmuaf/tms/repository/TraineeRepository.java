package edu.hcmuaf.tms.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.hcmuaf.tms.entity.Trainee;

public interface TraineeRepository extends JpaRepository<Trainee, Long>, DataTablesRepository<Trainee, Long> {

}