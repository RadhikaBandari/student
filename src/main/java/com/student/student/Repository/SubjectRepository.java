package com.student.student.Repository;

import com.student.student.Entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,String> {
}
