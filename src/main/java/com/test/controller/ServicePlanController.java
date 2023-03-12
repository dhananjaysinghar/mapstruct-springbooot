package com.test.controller;

import com.test.dto.ServicePlan;
import com.test.service.ServicePlanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class ServicePlanController {

  private final ServicePlanService servicePlanService;

  @PostMapping
  public Mono<ServicePlan> addServicePlan(@RequestBody ServicePlan servicePlan) {
    log.info("Received request to add servicePlan");
    return servicePlanService.addServicePlan(servicePlan);
  }

  @GetMapping("/{servicePlanId}")
  public Mono<ServicePlan> getServicePlan(@PathVariable String servicePlanId) {
    log.info("Received request to get servicePlan :: {}", servicePlanId);
    return servicePlanService.getServicePlan(servicePlanId);
  }
}
