package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemDetailsDAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class ItemDetailsService {

    @Autowired
    ItemDetailsDAL itemDetailsDAL;

    @Transactional
    public void delete(int id) {
        itemDetailsDAL.delete(id);
    }
}
