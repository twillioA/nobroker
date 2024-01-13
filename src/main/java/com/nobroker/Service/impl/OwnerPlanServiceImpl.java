package com.nobroker.Service.impl;


import com.nobroker.Entity.OwnerPlan;
import com.nobroker.Payload.OwnerPlanDto;
import com.nobroker.Repository.OwnerPlanRepository;
import com.nobroker.Service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {

    private ModelMapper modelMapper;
    private OwnerPlanRepository ownerPlanRepository;
    public OwnerPlanServiceImpl(OwnerPlanRepository ownerPlanRepository, ModelMapper modelMapper) {
        this.ownerPlanRepository = ownerPlanRepository;
        this.modelMapper = modelMapper;
    }



    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = maptoEntity(ownerPlanDto);
        OwnerPlan savedOwnerPlan = ownerPlanRepository.save(ownerPlan);
        return maptoDto(savedOwnerPlan);
    }

    @Override
    public List<OwnerPlanDto> getAllOwnerPlans() {
        List<OwnerPlan> ownerPlans = ownerPlanRepository.findAll();
        List<OwnerPlanDto> ownerPlanDtos= ownerPlans.stream().map(plan-> maptoDto(plan)).collect(Collectors.toList());
        return ownerPlanDtos;
    }

    OwnerPlan maptoEntity(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;


    }

    OwnerPlanDto maptoDto(OwnerPlan ownerPlan) {
        OwnerPlanDto ownerPlanDto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return ownerPlanDto;
    }
}