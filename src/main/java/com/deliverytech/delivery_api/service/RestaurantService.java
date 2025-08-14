package com.deliverytech.delivery_api.service;

import java.util.List;

import com.deliverytech.delivery_api.dto.RestaurantDto;

public interface RestaurantService {
    public List<RestaurantDto> findAll();
}
