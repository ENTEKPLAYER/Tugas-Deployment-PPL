package com.ppl.tugasdeploymentppl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DummyData {
    @Id
    @GeneratedValue
    private Integer id;
    private String nama;
}
