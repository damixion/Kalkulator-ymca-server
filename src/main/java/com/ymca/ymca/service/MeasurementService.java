package com.ymca.ymca.service;

import com.ymca.ymca.model.Measurement;
import com.ymca.ymca.repository.MeasurementRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MeasurementService {

    private final MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public Measurement addMeasurement(Measurement measurement) { return measurementRepository.save(measurement); }

    public void delMeasurement(Long id)
    {
        measurementRepository.deleteById(id);
    }

    public Optional<Measurement> findMeasurementById(Long id)
    {
        return measurementRepository.findById(id);
    }

    public Iterable<Measurement> findAll() { return measurementRepository.findAll(); }

    public Iterable<Measurement>findMeasurementName(String name)
    {
        ArrayList<Measurement> listEqualMeasurement = new ArrayList<Measurement>();

        findAll().forEach(  meas -> {
            if(meas.getName().equals(name))
                {
                    listEqualMeasurement.add(meas);
                }
        });
          return listEqualMeasurement;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void addProductForDb()
    {

    }
}



