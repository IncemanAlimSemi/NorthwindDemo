package com.alsein.northwind.business.abstracts;

import java.util.List;

import com.alsein.northwind.core.utilities.results.DataResult;
import com.alsein.northwind.core.utilities.results.Result;
import com.alsein.northwind.entities.concretes.Product;
import com.alsein.northwind.entities.dtos.ProductWithCategoryDto;

public interface IProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	DataResult<List<Product>> getAllSorted();
	Result add(Product product);
	DataResult<Product> getByProductName(String productName);
	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
	DataResult<List<Product>> getByProductNameOrCategory(String prductName, int categoryId);
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);
	DataResult<List<Product>> getByProductNameContains(String productName);
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
}
