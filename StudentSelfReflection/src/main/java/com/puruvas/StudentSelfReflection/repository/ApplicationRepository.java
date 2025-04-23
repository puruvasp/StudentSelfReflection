package com.puruvas.StudentSelfReflection.repository;

import com.puruvas.StudentSelfReflection.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
