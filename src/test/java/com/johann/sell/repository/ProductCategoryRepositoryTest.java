package com.johann.sell.repository;

import com.johann.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByIdTest() {
        ProductCategory productCategory = repository.findById(123456).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    //@Transactional
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 2);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(1,2,3,4);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = repository.findById(1).orElse(null);
        if (productCategory != null) {
            productCategory.setCategoryName("男生最爱2");
            ProductCategory result = repository.save(productCategory);
            Assert.assertEquals("男生最爱1", result.getCategoryName());
        }

    }
}