package com.ecopointstandard.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Table
public class EcoPointStandard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long standardId;

    @Column(nullable = false)
    private String classification;  //재활용품 분류

    @Column(nullable = false)
    private long countweightstandard;
    
    @Column(nullable = false)
    private String standardDesc;  

    @Column(nullable = false)
    private long ecoPoint;
  
}


