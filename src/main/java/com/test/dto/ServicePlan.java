package com.test.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicePlan {
  private String servicePlanNumber;
  private String agreementNumber;
  private List<Product> products;
  private Booking booking;
}
