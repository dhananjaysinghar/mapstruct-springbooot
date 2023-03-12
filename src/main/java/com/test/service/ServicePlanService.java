package com.test.service;

import com.test.dto.ServicePlan;
import com.test.mapper.ServicePlanMapper;
import com.test.repo.ServicePlanRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ServicePlanService {

  private final ServicePlanRepo servicePlanRepo;
  private final ServicePlanMapper servicePlanMapper;

  public Mono<ServicePlan> addServicePlan(ServicePlan servicePlan) {
    return Mono.just(servicePlanMapper.toServicePlanEntity(servicePlan))
        .flatMap(servicePlanRepo::save)
        .map(servicePlanMapper::toServicePlan);
  }

  public Mono<ServicePlan> getServicePlan(String servicePlanId) {
    return servicePlanRepo.findById(servicePlanId).map(servicePlanMapper::toServicePlan);
  }
}
