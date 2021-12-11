package com.ymca.ymca.controller;

import com.ymca.ymca.model.Measurement;
import com.ymca.ymca.service.MeasurementService;
import org.springframework.web.bind.annotation.*;


//pomysly
//strzalka oznaczajaca kierunek postepu
//kolory pomiaru nadwaga, otylosc itp


@RestController()
@RequestMapping("/api")
public class MeasurementControler {

    private MeasurementService measurementService;

    public MeasurementControler(MeasurementService measurementService )
    {
        this.measurementService = measurementService;
    }


    @GetMapping("/all")
    public Iterable<Measurement> getAllMeasurement()
    {
        return measurementService.findAll();
    }

    @GetMapping("/name")
    public Iterable<Measurement> getAllMeasurement(@RequestParam String name)
    {
        return measurementService.findMeasurementName(name);
    }

    @PostMapping("/add")
    public Measurement addMeasurement(@RequestBody Measurement measurement)
    {
        return measurementService.addMeasurement(measurement);
    }

    @DeleteMapping("/delete")
    public void deleteMeasurement(@RequestParam Long id)
    {
        measurementService.delMeasurement(id);
    }
}
