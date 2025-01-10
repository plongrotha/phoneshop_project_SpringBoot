package com.phoneshopmanagement.Service;

import com.phoneshopmanagement.Enity.Brand;

public interface BrandService {

	Brand save(Brand brand);

	Brand getById(Integer id);

	Brand update(Integer id,Brand brandUpdate);
}
