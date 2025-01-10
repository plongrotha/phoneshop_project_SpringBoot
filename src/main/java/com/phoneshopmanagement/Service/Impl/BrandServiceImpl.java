package com.phoneshopmanagement.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.phoneshopmanagement.Enity.Brand;
import com.phoneshopmanagement.Repository.BrandRepository;
import com.phoneshopmanagement.Service.BrandService;
import com.phoneshopmanagement.exception.ApiException;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand save(Brand brand) {
		return brandRepository.save(brand);
	}

	@Override
	public Brand getById(Integer id) {
		return brandRepository.findById(id)
				// .orElseThrow(
				// () -> new HttpClientErrorException(HttpStatus.NOT_FOUND, "Brand id %d is not
				// found".formatted(id)));
				.orElseThrow(
						() -> new ApiException(HttpStatus.NOT_FOUND,("Brand id %d is not found").formatted(id)));
	}

	@Override
	public Brand update(Integer id, Brand brandUpdate) {
		Brand brand = getById(id);
		brand.setName(brandUpdate.getName()); // to do update
		return brandRepository.save(brand);
	}
}
