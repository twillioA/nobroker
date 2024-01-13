package com.nobroker.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="owner_plan")
public class OwnerPlan {
   @Id
 private long   PlanId;

   @Column(name = "plan_name", unique = true)
    private String PlanName;

   @Column(name = "plan_validity")
   private int planValidity;

   @Column(name = "price")
   private double price;

   @Column(name = "relationship_Manager")
   private boolean RelationshipManager;

   @Column(name = "rental_Agreement")
   private boolean RentalAgreement;

   @Column(name = "Property_Promotion")
   private boolean PropertyPromotion;

   @Column(name = "guaranteed_Tenants")
   private boolean GuaranteedTenants;

   @Column(name = "showing_Property")
   private boolean ShowingProperty;

   @Column(name = "facebook_Marketing")
   private boolean FacebookMarketingofProperty;
}
