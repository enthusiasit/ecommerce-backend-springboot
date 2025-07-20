package com.cn.cnkart.dal;

import com.cn.cnkart.entity.Item;
import org.springframework.web.bind.annotation.PathVariable;

public interface ItemDAL {

    Item getItemById(int id);

    void saveItem(Item item);
    void deleteItem(int id);
    void updateItem(Item updatedItem);
}
