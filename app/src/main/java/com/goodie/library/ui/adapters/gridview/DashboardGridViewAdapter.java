package com.goodie.library.ui.adapters.gridview;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.goodie.library.R;
import java.util.ArrayList;

/**
 * Created by pandu.abbiyuarsyah on 07/03/2017.
 */

public class DashboardGridViewAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<String> listimage;
    private ArrayList<Integer> listtext;

    public DashboardGridViewAdapter(Context context, ArrayList<String> listimage, ArrayList<Integer> listtext) {
        this.listimage = listimage;
        this.listtext = listtext;
        this.context = context;

    }

    public int getCount() {
        return listimage.size();
    }

    public Object getItem(int position) {
        return listimage.get(position);
    }

    public long getItemId(int position) {
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder view;
        LayoutInflater inflater = LayoutInflater.from(context);

        if(convertView==null)
        {
            view = new ViewHolder();
            convertView = inflater.inflate(R.layout.grid_cell, null);
            view.txtViewTitle = (TextView) convertView.findViewById(R.id.textView1);
            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(view);
        }else{
            view = (ViewHolder) convertView.getTag();
        }

        view.txtViewTitle.setText(listimage.get(position));
        //view.imgViewFlag.setImageResource(listtext.get(position));


        Glide.with(context).load(listtext.get(position))
                .into(view.imgViewFlag);


        return convertView;
    }



}
