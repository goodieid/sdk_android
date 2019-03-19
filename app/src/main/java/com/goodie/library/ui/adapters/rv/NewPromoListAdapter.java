package com.goodie.library.ui.adapters.rv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.goodie.library.R;
import java.util.ArrayList;

/**
 * Created by Goodie on 30/01/2019.
 */

public class NewPromoListAdapter extends RecyclerView.Adapter<NewPromoListAdapter.NewPromoListHolder>{


    private ArrayList<String> listimage;
    private ArrayList<Integer> listtext;
    private Context mContext;

    public NewPromoListAdapter(Context context, ArrayList<String> listimage, ArrayList<Integer> listtext) {
        this.listimage = listimage;
        this.listtext = listtext;
        this.mContext = context;
    }

    @Override
    public NewPromoListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_card, null);
        NewPromoListHolder mh = new NewPromoListHolder(v);
        return mh;
    }


    @Override
    public void onBindViewHolder(NewPromoListHolder holder, int i) {

        holder.tvDesc.setText(listimage.get(i));
        holder.tvTitle.setText(listimage.get(i));
        Glide.with(mContext).load(listtext.get(i))
                .fitCenter()
                .into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return (null != listtext ? listtext.size() : 0);
    }

    public class NewPromoListHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected ImageView itemImage;
        protected TextView tvDesc;

        public NewPromoListHolder(View view) {
            super(view);


            this.tvDesc = (TextView) view.findViewById(R.id.tv_desc);
            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    //Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();

                }
            });


        }

    }


}
