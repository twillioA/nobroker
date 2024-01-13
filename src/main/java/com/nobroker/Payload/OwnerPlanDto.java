package com.nobroker.Payload;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "omner_plans")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OwnerPlanDto {
@Id
 private long   PlanId;
 private String PlanName;
   private int planValidity;
   private double price;
   private boolean RelationshipManager;
   private boolean RentalAgreement;
   private boolean PropertyPromotion;
   private boolean GuaranteedTenants;
   private boolean ShowingProperty;
   private boolean FacebookMarketingofProperty;
}
