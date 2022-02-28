package com.mabmsa.app.service;

import java.util.List;
import java.util.Optional;

import com.mabmsa.app.model.Brand;

public interface BrandService {

	List<Brand> showBrands();

	void saveBrand(Brand brand);

	Optional<Brand> getBrand(Long brandId);

	void deleteBrand(Long brandId);

}
