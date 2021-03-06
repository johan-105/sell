package com.johann.sell.service;

import com.johann.sell.model.ProductCategory;

import java.util.List;

public interface CategoryService {

    ProductCategory findById(Integer id);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
