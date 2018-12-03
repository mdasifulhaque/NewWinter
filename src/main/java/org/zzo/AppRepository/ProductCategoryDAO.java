package org.zzo.AppRepository;

import java.util.List;

import org.zzo.AppEntity.product.ProductCategory;
import org.zzo.ExceptionObject.NotAbleToUpdate;


public interface ProductCategoryDAO {
	
	public Long deleteObject(Long Id) throws  Exception;

	public ProductCategory getObject(Long Id);
	
	public List<ProductCategory> getObjectList();
	
	public void putObject(ProductCategory productCategory, Long categoryId)  throws NotAbleToUpdate, Exception ;
	
	public Long postObject(ProductCategory productCategory);
	
}