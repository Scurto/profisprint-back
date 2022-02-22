package com.profisprint.service;

import com.profisprint.model.advertise.AdvertiseDto;
import com.profisprint.model.advertise.AdvertiseScreenDto;

import java.util.List;

public interface AdvertiseService {
    List<AdvertiseDto> getAdvertisesForSimpleTask(String taskId, String customerId, String countOfAdvertise, String countOfAdvertiseMove);
    List<AdvertiseScreenDto> getAdvertisesForScreenTask(String taskId, String customerId, String countOfAdvertise, String countOfAdvertiseMove);
}
