package com.telusko.demo.service;

import com.telusko.demo.model.itemmaster;
import com.telusko.demo.repository.ItemMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ItemMasterService {

    @Autowired
    private ItemMasterRepository itemMasterRepository;

    public List<itemmaster> fetchItemMasterList() {
        return itemMasterRepository.findAll();
    }

    public Optional<itemmaster> fetchItemMasterById(Long itemId) {
        return itemMasterRepository.findById(itemId);
    }

    public String newItemCreation(itemmaster item) {
        itemmaster insertedItem = itemMasterRepository.save(item);
        if(Objects.nonNull(insertedItem)){
            return "Successfully inserted";
        }
        return "failed to insert";
    }

    public String removeItem(Long itemId) {
        itemMasterRepository.deleteById(itemId);
        return "Successfully removed Item";
    }

    public String updateItemMaster(itemmaster item) {
        Optional<itemmaster> getItem = itemMasterRepository.findById(item.getId());
        if(getItem.isPresent()){
            itemmaster foundItem = getItem.get();
            foundItem.setItemCode(item.getItemCode());
            foundItem.setItemName(item.getItemName());
            itemMasterRepository.save(foundItem);
            return "Successfully Updated";
        } else{
            return "Record not available";
        }
    }
}
