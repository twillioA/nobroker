package com.nobroker.Service.impl;

import com.nobroker.Entity.OwnerPlan;
import com.nobroker.Payload.OwnerPlanDto;
import com.nobroker.Repository.OwnerPlanRepository;
import com.nobroker.Service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {

    private ModelMapper modelMapper;

    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository, ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }

    private OwnerPlanRepository ownerPlanRepository;

    @Override
    public OwnerPlan createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = maptoEntity(ownerPlanDto);
        OwnerPlan saveOwnerPlan = ownerPlanRepository.save(ownerPlan);
       return  maptoDto(saveOwnerPlan);
    }

    OwnerPlan maptoEntity(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;


    }

    OwnerPlan maptoDto(OwnerPlan ownerPlan) {
        OwnerPlanDto ownerPlanDtodto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlan;
    }
}