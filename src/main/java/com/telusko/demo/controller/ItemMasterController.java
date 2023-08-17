package com.telusko.demo.controller;

import com.telusko.demo.model.itemmaster;
import com.telusko.demo.service.ItemMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/itemmaster")
public class ItemMasterController {

    @Autowired
    private ItemMasterService itemMasterService;

    // To fetch All records from item_master table
    @GetMapping("/getAllItems")
    private List<itemmaster> getAllItemMasterDetails() {
        List<itemmaster> itemmasterList = new ArrayList<itemmaster>();
        itemmasterList = itemMasterService.fetchItemMasterList();
        return itemmasterList;
    }

    //To fetch a particular item from item_master by providing primary_key as input
    @GetMapping("/getItemById/{itemId}")
    private itemmaster getItemByid(@PathVariable (value="itemId") Long itemId) {
        Optional<itemmaster> selectItem = itemMasterService.fetchItemMasterById(itemId);
        return selectItem.orElse(null);
    }

    //To save a new item into item_master
    @PostMapping("/newItem")
    private String newItemCreation(@RequestBody itemmaster item){
        return itemMasterService.newItemCreation(item);
    }

    //To remove a particular item from item_master by providing primary_key as input
    @DeleteMapping("removeItem/{itemId}")
    private String removeItemFromList(@PathVariable (value="itemId") Long itemId){
        return itemMasterService.removeItem(itemId);
    }

    //To update a particular item (we cannot update primary_key)
    @PutMapping("/updateItem")
    private String updateParticularItem(@RequestBody itemmaster item){
        return itemMasterService.updateItemMaster(item);
    }

}
