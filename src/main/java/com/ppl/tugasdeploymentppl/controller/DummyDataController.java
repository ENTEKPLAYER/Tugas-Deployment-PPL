package com.ppl.tugasdeploymentppl.controller;

import com.ppl.tugasdeploymentppl.model.DummyData;
import com.ppl.tugasdeploymentppl.service.DummyDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/dummy")
public class DummyDataController {
    private final DummyDataService dummyDataService;
    @GetMapping("/all")
    public ResponseEntity<List<DummyData>> getAllJasaTravelling() {
        List<DummyData> response = dummyDataService.findAll();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/create/{nama}")
    public ResponseEntity<DummyData> createJasaTravelling(@PathVariable String nama) {
        return ResponseEntity.ok(dummyDataService.create(nama));
    }
}
