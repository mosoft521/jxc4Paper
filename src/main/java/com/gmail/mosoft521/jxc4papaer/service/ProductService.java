package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Product;
import com.gmail.mosoft521.jxc4papaer.vo.ProductVO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductService {

    List<ProductVO> list();

    List<ProductVO> list(Integer providerId);

    @Transactional
    boolean saveOrUpdate(Product product);

    @Transactional
    boolean delete(Integer productId);

    String getNameById(Integer productId);

    Product getById(Integer productId);
}