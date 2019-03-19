package com.goodie.library.ui.adapters.pager;

import android.content.Context;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.github.silvestrpredko.dotprogressbar.DotProgressBar;
import com.goodie.library.R;
import java.util.ArrayList;


/**
 * Created by firwandi.ramli on 11/8/2017.
 */

public class AdvBannerMainPageAdapter extends PagerAdapter {

    private ArrayList<Integer> listimage;
    private LayoutInflater inflater;
    private Context context;

    public AdvBannerMainPageAdapter(ArrayList<Integer> listtext, Context context) {
        this.listimage = listtext;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return listimage.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, final int position) {
        View imageLayout = inflater.inflate(R.layout.item_introduction, view, false);
        assert imageLayout != null;

        final DotProgressBar pbIntro = (DotProgressBar)imageLayout.findViewById(R.id.introduction_pbImg);
        final TextView tvError = (TextView)imageLayout.findViewById(R.id.introduction_tverror);
        final ImageView imgIntro = (ImageView) imageLayout.findViewById(R.id.introduction_image);
        Glide.with(context).load(listimage.get(position))
                .into(imgIntro);


        view.addView(imageLayout, 0);
        return imageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

}
