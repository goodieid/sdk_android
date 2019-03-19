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
 * Created by Goodie on 04/02/2019.
 */

public class VoucherListAdapter extends RecyclerView.Adapter<VoucherListAdapter.VoucherListHolder>{

    private ArrayList<String> listimage;
    private ArrayList<Integer> listtext;
    private Context mContext;

    public VoucherListAdapter(Context context, ArrayList<String> listimage, ArrayList<Integer> listtext) {
        this.listimage = listimage;
        this.listtext = listtext;
        this.mContext = context;
    }

    @Override
    public VoucherListAdapter.VoucherListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_voucher, null);
        VoucherListAdapter.VoucherListHolder mh = new VoucherListAdapter.VoucherListHolder(v);
        return mh;
    }


    @Override
    public void onBindViewHolder(VoucherListAdapter.VoucherListHolder holder, int i) {

        holder.tvTitle.setText(listimage.get(i));
        holder.tvDesc.setText(listimage.get(i));
        Glide.with(mContext).load(listtext.get(i))
                .into(holder.itemImage);
    }

    @Override
    public int getItemCount() {
        return (null != listtext ? listtext.size() : 0);
    }

    public class VoucherListHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;
        protected TextView tvDesc;
        protected ImageView itemImage;


        public VoucherListHolder(View view) {
            super(view);
            this.tvTitle   = (TextView) view.findViewById(R.id.tv_title);
            this.tvDesc    = (TextView) view.findViewById(R.id.tv_desc);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });


        }

    }

}
