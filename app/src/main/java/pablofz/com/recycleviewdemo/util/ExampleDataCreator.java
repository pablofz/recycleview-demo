package pablofz.com.recycleviewdemo.util;

import java.util.ArrayList;
import java.util.List;

import pablofz.com.recycleviewdemo.model.Item;

/**
 * Created by pablofe-ot on 6/1/16.
 */
public abstract class ExampleDataCreator {

    public static List<Item> getExampleDataSet()
    {
        int qtyItems = 1001;
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <qtyItems; i++) {
            items.add(new Item("Item "+i,"Item "+i+" of "+(qtyItems-1)));
        }


        return items;
    }

}
