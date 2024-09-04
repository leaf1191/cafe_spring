package com.example.fullCafe_spring_maven.repository.visit;

import com.example.fullCafe_spring_maven.model.Visit;
import com.example.fullCafe_spring_maven.model.key.VisitId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, VisitId> {
}
