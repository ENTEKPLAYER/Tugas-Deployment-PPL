package com.ppl.tugasdeploymentppl.service;

import com.ppl.tugasdeploymentppl.model.DummyData;
import com.ppl.tugasdeploymentppl.repository.DummyDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DummyDataServiceImpl implements DummyDataService {
    private final DummyDataRepository dummyDataRepository;
    @Override
    public List<DummyData> findAll() {
        return dummyDataRepository.findAll();
    }

    @Override
    public DummyData create(String nama) {
        return dummyDataRepository.save(DummyData.builder()
                .nama(nama)
                .build());
    }
}
