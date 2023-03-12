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
public class Booking {
  private String bookingNumber;
  private String bookingDate;
  private String bookingStatus;
  private List<Party> parties;
}
