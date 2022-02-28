package com.mabmsa.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mabmsa.app.model.Brand;
import com.mabmsa.app.repository.BrandRepository;
import com.mabmsa.app.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;

	@Override
	public List<Brand> showBrands() {
		return brandRepository.findAll();
	}

	@Override
	public void saveBrand(Brand brand) {
		this.brandRepository.save(brand);
	}
	@Override
	public Optional<Brand> getBrand(Long brandId) {
		return brandRepository.findById(brandId);

	}
	@Override
	public void deleteBrand(Long brandId) {
		brandRepository.deleteById(brandId);

	}

}
