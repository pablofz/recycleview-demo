package pablofz.com.recycleviewdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pablofe-ot on 6/1/16.
 */
public abstract class ExampleDataCreator {

    public static List<Item> getExampleDataSet()
    {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Item 1","First Item"));
        items.add(new Item("Item 2","Second Item"));
        items.add(new Item("Item 3","Third Item"));

        return items;
    }

}
