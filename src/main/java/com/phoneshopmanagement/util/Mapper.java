package com.phoneshopmanagement.util;

import com.phoneshopmanagement.DTO.BrandDTO;
import com.phoneshopmanagement.Enity.Brand;

public class Mapper {

	public static Brand toEntity(BrandDTO dto) {
		Brand brand = new Brand();

		brand.setId(dto.getId());
		brand.setName(dto.getName());
		return brand;
	}
}
