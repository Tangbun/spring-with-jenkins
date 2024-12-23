package com.example.jenkins;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demos")
@RequiredArgsConstructor
public class DemoController {

  @GetMapping
  public String index() {
    return "Hello, Jenkins!";
  }

  @GetMapping("test")
  public String test() {
    return "Hello, Jenkins! This is a test.";
  }
}
