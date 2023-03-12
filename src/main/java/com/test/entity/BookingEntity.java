package com.test.entity;

import java.util.List;
import lombok.Data;

@Data
public class BookingEntity {
  private String bookingId;
  private String bookingDate;
  private String bookingStatus;
  private List<PartyEntity> parties;
}
