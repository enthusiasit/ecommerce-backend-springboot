package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Item;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class ItemDALImpl implements ItemDAL {


    @Autowired
    EntityManager entityManager;

    @Override
    public Item getItemById(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        return item;
    }

    @Override
    public void saveItem(Item item) {
        Session session = entityManager.unwrap(Session.class);
        session.save(item);
    }

    @Override
    public void deleteItem(int id) {
        Session session = entityManager.unwrap(Session.class);
        Item item = session.get(Item.class, id);
        session.delete(item);
    }

    @Override
    public void updateItem(Item updatedItem) {
        Session session = entityManager.unwrap(Session.class);
        Item currentItem = getItemById(updatedItem.getId());
        currentItem.setDescription(updatedItem.getDescription());
        currentItem.setName(updatedItem.getName());
        session.update(currentItem);
    }
}
