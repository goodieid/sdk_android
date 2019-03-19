package com.goodie.library.ui.fragments;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import com.goodie.library.R;
import com.goodie.library.ui.activities.BaseActivity;
import com.goodie.library.ui.adapters.gridview.DashboardGridViewAdapter;
import com.goodie.library.ui.adapters.pager.AdvBannerMainPageAdapter;
import com.goodie.library.ui.adapters.rv.NewPromoListAdapter;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.ArrayList;
import butterknife.BindView;

/**
 * Created by Goodie on 30/01/2019.
 */

public class HomeFragment extends BaseFragment {

    @BindView(R.id.gridView)
    GridView gridView;
    @BindView(R.id.homeViewpager)
    ViewPager homeViewpager;
    @BindView(R.id.rvPromo)
    RecyclerView rvPromo;

    public AdvBannerMainPageAdapter mAdapterHotSales;
    private NewPromoListAdapter newPromoAdapter;
    private DashboardGridViewAdapter mAdapter;
    private ArrayList<String> listImage;
    private ArrayList<Integer> listtext;
    private Handler advSliderHandler;
    private static int currentPage = 0;

    private final int SLIDER_DELAY_ADVERTISING_IN_SECOND = 5;
    @BindView(R.id.circleMenuPageIndicator)
    CirclePageIndicator circlePageIndicator;


    @Override
    protected int getLayout(){
        return R.layout.home_fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }


    @Override
    public void onResume(){
        super.onResume();
        loadAdvertising();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        gridView.setVerticalScrollBarEnabled(false);
        gridView.setOnTouchListener(new View.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    return true;
                }
                return false;
            }

        });
        loadMenuDashboard();
        loadNewPromo();
    }


    private void loadNewPromo(){
        listImage = new ArrayList<String>();
        listImage.add(getString(R.string.home_promo1));
        listImage.add(getString(R.string.home_promo2));
        listImage.add(getString(R.string.home_promo3));
        listtext = new ArrayList<Integer>();
        listtext.add(R.drawable.ic_promotion_1);
        listtext.add(R.drawable.ic_promotion_2);
        listtext.add(R.drawable.ic_promotion_3);
        rvPromo.setHasFixedSize(true);
        newPromoAdapter = new NewPromoListAdapter(getContext(), listImage, listtext);
        rvPromo.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        rvPromo.setAdapter(newPromoAdapter);
    }


    private void loadMenuDashboard(){
        listImage = new ArrayList<String>();

        listImage.add(getString(R.string.home_fandb));
        listImage.add(getString(R.string.home_beauty));
        listImage.add(getString(R.string.home_ecommerce));
        listImage.add(getString(R.string.home_ecommerce));
        listImage.add(getString(R.string.home_travel));
        listImage.add(getString(R.string.home_invesment));
        listImage.add(getString(R.string.home_jewelry));
        listImage.add(getString(R.string.home_other));
        listtext = new ArrayList<Integer>();
        listtext.add(R.drawable.ic_cat_fnb);
        listtext.add(R.drawable.ic_cat_beauty);
        listtext.add(R.drawable.ic_cat_ecommerce);
        listtext.add(R.drawable.ic_cat_travel);
        listtext.add(R.drawable.ic_cat_ecommerce);
        listtext.add(R.drawable.ic_cat_investment);
        listtext.add(R.drawable.ic_cat_jewelry);


        listtext.add(R.drawable.ic_cat_other);
        mAdapter = new DashboardGridViewAdapter(getContext(), listImage, listtext);
        gridView.setAdapter(mAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position == 0){

                }
            }
        });
    }


    private void loadAdvertising(){
        listtext = new ArrayList<Integer>();
        listtext.add(R.drawable.ic_img_slider);
        mAdapterHotSales = new AdvBannerMainPageAdapter(listtext,  (BaseActivity) getActivity());
        homeViewpager.setAdapter(mAdapterHotSales);
        circlePageIndicator.setViewPager(homeViewpager);
        advSliderHandler = new Handler();
        startPageAdvSwitchTimer();
    }


    private void startPageAdvSwitchTimer(){
        advSliderHandler.postDelayed(advSliderRunnable, SLIDER_DELAY_ADVERTISING_IN_SECOND * 1000);
    }

    private void stopPageAdvSwitchTimer() {
        advSliderHandler.removeCallbacks(advSliderRunnable);
    }


    private Runnable advSliderRunnable = new Runnable() {
        @Override
        public void run() {
            if(currentPage == 4){
                currentPage = 0;
            }
            homeViewpager.setCurrentItem(currentPage++,true);
            startPageAdvSwitchTimer();
        }
    };

}
