package edu.hcmuaf.tms.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.hcmuaf.tms.entity.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>, DataTablesRepository<Topic, Long> {

}
