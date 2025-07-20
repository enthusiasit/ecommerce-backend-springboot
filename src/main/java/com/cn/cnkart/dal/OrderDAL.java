package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Order;

public interface OrderDAL {
    Order getById(int id);

    void delete(int id);

    void saveOrder(Order saveOrder);
}
