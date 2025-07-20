package com.cn.cnkart.service;

import com.cn.cnkart.dal.ItemDAL;
import com.cn.cnkart.dal.OrderDAL;
import com.cn.cnkart.entity.Item;
import com.cn.cnkart.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderDAL orderDAL;

    @Autowired
    ItemDAL itemDAL;

    @Transactional
    public Order getById(int id) {
        return orderDAL.getById(id);
    }

    @Transactional
    public void save(Order order) {
        Order saveOrder = new Order();
        saveOrder.setOrderType(order.getOrderType());

        List<Item> itemList = new ArrayList<>();
        for (Item item : order.getItems())
        {
            Item currentItem = itemDAL.getItemById(item.getId());
            itemList.add(currentItem);
        }

        saveOrder.setItems(itemList);

        orderDAL.saveOrder(saveOrder);
    }

    @Transactional
    public void delete(int id) {
        orderDAL.delete(id);
    }
}
