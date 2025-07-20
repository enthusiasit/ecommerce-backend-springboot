package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Order;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class OrderDALImpl implements OrderDAL{

    @Autowired
    EntityManager em;

    @Override
    public Order getById(int id) {
        Session session = em.unwrap(Session.class);
        Order order = session.get(Order.class, id);
        return order ;
    }

    @Override
    public void saveOrder(Order order) {
        Session session = em.unwrap(Session.class);
        session.save(order);
    }

    @Override
    public void delete(int id) {
        Session session = em.unwrap(Session.class);
        Order deleteOrder = session.get(Order.class, id);
        session.delete(deleteOrder);
    }
}
