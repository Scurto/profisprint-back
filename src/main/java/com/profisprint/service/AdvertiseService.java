package com.profisprint.service;

import com.profisprint.model.advertise.AdvertiseDto;

import java.util.List;

public interface AdvertiseService {
    List<AdvertiseDto> getAdvertisesForSimpleTask(String taskId, String customerId, String CountOfAdvertise, String countOfAdvertiseMove);
}
