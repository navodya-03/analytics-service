package com.analytics.analytics_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analytics.analytics_service.dto.WorkoutRecordDto;
import com.analytics.analytics_service.service.WorkoutRecordService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/ingest/")
public class WorkoutRecordController {

    private final WorkoutRecordService workoutRecordService;
    public WorkoutRecordController(WorkoutRecordService workoutRecordService) {
        this.workoutRecordService = workoutRecordService;
    }

    @PostMapping("/workout")
    public ResponseEntity<String> saveWorkoutRecord(@Valid @RequestBody WorkoutRecordDto dto){
        workoutRecordService.saveRecord(dto);

        return ResponseEntity.ok("record successfully created and saved");
    }
    
}
