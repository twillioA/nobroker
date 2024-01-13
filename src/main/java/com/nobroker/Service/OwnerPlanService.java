package com.nobroker.Service;

import com.nobroker.Entity.OwnerPlan;
import com.nobroker.Payload.OwnerPlanDto;

import java.util.List;

public interface OwnerPlanService {

    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto);

    List<OwnerPlanDto> getAllOwnerPlans();
}
