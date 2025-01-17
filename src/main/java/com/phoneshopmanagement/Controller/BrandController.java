package com.phoneshopmanagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.phoneshopmanagement.DTO.BrandDTO;
import com.phoneshopmanagement.Enity.Brand;
import com.phoneshopmanagement.Service.BrandService;
import com.phoneshopmanagement.util.Mapper;

@RestController
@RequestMapping("/brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toEntity(brandDTO);
		brand = brandService.save(brand);
		return ResponseEntity.ok(brand);
	}

}
