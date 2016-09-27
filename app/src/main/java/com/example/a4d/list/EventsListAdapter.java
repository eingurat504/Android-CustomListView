package com.example.a4d.list;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
 
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
 
public class EventsListAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private List<DataEvents> eventItems;
    ImageLoader imageLoader = AppController.getInstance().getImageLoader();
 
    public EventsListAdapter(Activity activity, List<DataEvents> eventItems) {
        this.activity = activity;
        this.eventItems = eventItems;
    }
 
    @Override
    public int getCount() {
        return eventItems.size();
    }
 
    @Override
    public Object getItem(int location) {
        return eventItems.get(location);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
 
        if (inflater == null) inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) convertView = inflater.inflate(R.layout.list_row, null);
 
        if (imageLoader == null) imageLoader = AppController.getInstance().getImageLoader();

        NetworkImageView thumbnail = (NetworkImageView) convertView .findViewById(R.id.image);
        TextView title = (TextView) convertView.findViewById(R.id.title);

 
        // getting events data for the row
        DataEvents m = eventItems.get(position);
 
        // thumbnail image
        thumbnail.setImageUrl(m.getthumbnailImage(), imageLoader);
         
        // title
        title.setText(m.getTitle());
        

         

        return convertView;
    }
 
}