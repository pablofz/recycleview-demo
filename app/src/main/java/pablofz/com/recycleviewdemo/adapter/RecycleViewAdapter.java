package pablofz.com.recycleviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import pablofz.com.recycleviewdemo.model.Item;
import pablofz.com.recycleviewdemo.R;
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
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row, parent, false);

        return new RecycleViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        Item item = dataset.get(position);
        holder.setTitleText(item.getTitle());
        holder.setSubtitleText(item.getSubititle());
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
