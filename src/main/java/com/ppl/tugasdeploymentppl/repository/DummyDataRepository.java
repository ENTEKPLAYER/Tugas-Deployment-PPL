package com.ppl.tugasdeploymentppl.repository;

import com.ppl.tugasdeploymentppl.model.DummyData;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DummyDataRepository extends JpaRepository<DummyData, Integer> {
    @NonNull
    List<DummyData> findAll();
}
