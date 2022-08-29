package com.ecopointstandard.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ecopointstandard.demo.domain.EcoPointStandard;

import java.util.*;

// @CrossOrigin("http://localhost:3000")
// @RepositoryRestResource(excerptProjection = WithWriterProjection.class)
public interface PointStandardRepository extends JpaRepository<EcoPointStandard, Long> {
  Optional<EcoPointStandard> findByClassification(String classification);
  // List<User> findAll();
}
