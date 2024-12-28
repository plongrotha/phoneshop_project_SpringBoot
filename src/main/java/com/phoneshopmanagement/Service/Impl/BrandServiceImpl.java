package com.phoneshopmanagement.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phoneshopmanagement.Enity.Brand;
import com.phoneshopmanagement.Repository.BrandRepository;
import com.phoneshopmanagement.Service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand save(Brand brand) {
		return brandRepository.save(brand);
	}
}
