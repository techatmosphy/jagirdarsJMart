package com.mabmsa.app.service;

import java.util.List;

import com.mabmsa.app.model.Brand;

public interface BrandService {

	List<Brand> showBrands();

	void saveBrand(Brand brand);

}
