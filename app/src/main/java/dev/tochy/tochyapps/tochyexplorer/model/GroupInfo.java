package dev.tochy.tochyapps.tochyexplorer.model;

import java.util.List;

import dev.tochy.tochyapps.tochyexplorer.fragment.RootsFragment.Item;

/**
 * Created by tochy on 15/07/2021.
 */

public class GroupInfo {
    public String label;
    public List<Item> itemList;

    public GroupInfo(String text, List<Item> list){
        label = text;
        itemList = list;
    }
}
