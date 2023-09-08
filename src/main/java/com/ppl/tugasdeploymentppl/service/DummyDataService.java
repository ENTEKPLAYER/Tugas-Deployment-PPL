package com.ppl.tugasdeploymentppl.service;

import com.ppl.tugasdeploymentppl.model.DummyData;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DummyDataService {
    List<DummyData> findAll();
    DummyData create(String nama);
}
