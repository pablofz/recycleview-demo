package pablofz.com.recycleviewdemo.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import pablofz.com.recycleviewdemo.R;

/**
 * Created by pablofe-ot on 6/1/16.
 */
public class RecycleViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private TextView subtitle;

    public RecycleViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.title);
        subtitle = (TextView) itemView.findViewById(R.id.subititle);
    }

    public void setTitleText(String title) {
        this.title.setText(title);
    }

    public void setSubtitleText(String subtitle) {
        this.subtitle.setText(subtitle);
    }
}
