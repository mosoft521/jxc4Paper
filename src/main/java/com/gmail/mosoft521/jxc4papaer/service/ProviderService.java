package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Provider;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProviderService {

    List<Provider> list();

    @Transactional
    boolean saveOrUpdate(Provider provider);

    @Transactional
    boolean delete(Integer providerId);

    String getNameById(Integer providerId);
}