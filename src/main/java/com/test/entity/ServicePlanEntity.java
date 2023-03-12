package com.test.entity;

import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ServicePlanEntity {

  @Id
  private String servicePlanId;
  private String agreementNumber;
  private List<ProductEntity> productEntities;
  private BookingEntity bookingEntity;
}
