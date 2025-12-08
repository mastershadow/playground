package it.gis3d.playground.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.gis3d.playground.service.DummyService;

@RestController
@RequestMapping("/dummy")
public class DummyController {

  @Autowired
  private DummyService service;
  
  @GetMapping
  public ResponseEntity<String> index() {
    return ResponseEntity.ofNullable("Dummy");
  }
}
