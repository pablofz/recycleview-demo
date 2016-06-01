package pablofz.com.recycleviewdemo.model;

/**
 * Created by pablofe-ot on 6/1/16.
 */
public class Item {

    public String title;
    public String subititle;

    public Item(String title, String subititle)
    {
        this.title = title;
        this.subititle = subititle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubititle() {
        return subititle;
    }

    public void setSubititle(String subititle) {
        this.subititle = subititle;
    }
}
