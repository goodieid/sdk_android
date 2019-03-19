package com.goodie.library.ui.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.goodie.library.R;
import com.goodie.library.ui.adapters.rv.VoucherListAdapter;
import java.util.ArrayList;
import butterknife.BindView;

/**
 * Created by Goodie on 04/02/2019.
 */

public class ReedemFragment extends BaseFragment {


    private ArrayList<String> listImage;
    private ArrayList<Integer> listtext;
    @BindView(R.id.rv)
    RecyclerView rv;
    VoucherListAdapter voucherListAdapter;

    @Override
    protected int getLayout() {
        return R.layout.reedem_fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 1);
        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return position == 0 ? 1 : 1;
            }
        });

        rv.setLayoutManager(layoutManager);
        loadReedem();
    }


    private void loadReedem(){
        listImage = new ArrayList<String>();
        listImage.add(getString(R.string.home_promo1));
        listImage.add(getString(R.string.home_promo2));
        listImage.add(getString(R.string.home_promo3));
        listtext = new ArrayList<Integer>();
        listtext.add(R.drawable.ic_promotion_1);
        listtext.add(R.drawable.ic_promotion_2);
        listtext.add(R.drawable.ic_promotion_3);
        voucherListAdapter = new VoucherListAdapter(getContext(), listImage, listtext);
        rv.setAdapter(voucherListAdapter);
    }

}
