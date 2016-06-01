package pablofz.com.recycleviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import pablofz.com.recycleviewdemo.Item;
import pablofz.com.recycleviewdemo.viewholder.RecycleViewHolder;

/**
 * Created by pablofe-ot on 6/1/16.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    private List<Item> dataset;

    // Provide a suitable constructor (depends on the kind of dataset)
    public RecycleViewAdapter(List<Item> dataset) {
        this.dataset = dataset;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
