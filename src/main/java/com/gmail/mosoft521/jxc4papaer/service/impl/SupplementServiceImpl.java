package com.gmail.mosoft521.jxc4papaer.service.impl;

import com.gmail.mosoft521.jxc4papaer.dao.SupplementMapper;
import com.gmail.mosoft521.jxc4papaer.entity.Supplement;
import com.gmail.mosoft521.jxc4papaer.service.SupplementService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SupplementServiceImpl implements SupplementService {

    @Resource
    private SupplementMapper supplementMapper;

    @Override
    public List<Supplement> list() {
        return supplementMapper.selectByExample(null);
    }

    @Override
    public boolean saveOrUpdate(Supplement supplement) {
        int r = 0;
        if (null == supplement.getSupplementId()) {
            r = supplementMapper.insertSelective(supplement);
        } else {
            r = supplementMapper.updateByPrimaryKey(supplement);
        }
        return r > 0 ? true : false;
    }

    @Override
    public boolean delete(Integer supplementId) {
        return supplementMapper.deleteByPrimaryKey(supplementId) > 0 ? true : false;
    }

    @Override
    public Supplement getSupplementById(Integer supplementId) {
        return supplementMapper.selectByPrimaryKey(supplementId);
    }
}
