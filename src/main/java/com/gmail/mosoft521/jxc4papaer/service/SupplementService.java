package com.gmail.mosoft521.jxc4papaer.service;

import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface SupplementService {

    List<Supplement> list();

    @Transactional
    boolean saveOrUpdate(Supplement supplement);

    @Transactional
    boolean delete(Integer supplementId);

    Supplement getSupplementById(Integer supplementId);
}