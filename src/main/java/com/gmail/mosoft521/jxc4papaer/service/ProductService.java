package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Product;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductService {

    List<Product> list();

    @Transactional
    boolean saveOrUpdate(Product product);

    @Transactional
    boolean delete(Integer productId);

    String getNameById(Integer productId);
}