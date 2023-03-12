package com.test.mapper;

import com.test.dto.ServicePlan;
import com.test.entity.ServicePlanEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE, uses = {ProductMapper.class})
public interface ServicePlanMapper {

  @Mapping(source = "servicePlan.servicePlanNumber", target = "servicePlanId")
  @Mapping(source = "servicePlan.products", target = "productEntities")
  @Mapping(source = "servicePlan.booking", target = "bookingEntity")
  @Mapping(source = "servicePlan.booking.bookingNumber", target = "bookingEntity.bookingId")
  ServicePlanEntity toServicePlanEntity(ServicePlan servicePlan);

  @InheritInverseConfiguration
  ServicePlan toServicePlan(ServicePlanEntity servicePlanEntity);
}
