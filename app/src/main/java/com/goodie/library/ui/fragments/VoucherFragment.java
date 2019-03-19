package com.goodie.library.ui.fragments;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.TextView;
import com.goodie.library.R;
import com.goodie.library.ui.adapters.pager.VoucherPageAdapter;
import butterknife.BindView;

/**
 * Created by Goodie on 04/02/2019.
 */

public class VoucherFragment extends BaseFragment {

    private static final String TAG = "PurchaseVoucherFragment";

    @BindView(R.id.purchaseTablayout)
    TabLayout mTabLayout;

    @BindView(R.id.purchaseVP)
    ViewPager mViewPager;

    VoucherFragment mContext;

    private int[] tabIcons = {
           /* R.drawable.ic_voucher_digital_96px,
            R.drawable.ic_voucher_fisik_96px,
            R.drawable.ic_merchant_96px*/
    };

    public static VoucherFragment showTabFragment() {
        VoucherFragment tabStore = new VoucherFragment();
        return tabStore;
    }

    @Override
    protected int getLayout() {
        return R.layout.voucher_fragment;
    }

    /*@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

        mContext = new PurchaseVoucherFragment();
        FragmentTransaction transaction = getChildFragmentManager()
                .beginTransaction().replace(R.id.container, mContext);
    }*/

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
        setupTabIcons();
    }


    private void setupTabIcons() {
        View view1 = getActivity().getLayoutInflater().inflate(R.layout.custom_tab, null);
        TextView tv = (TextView)view1.findViewById(R.id.tv);
        tv.setText("Reedem");

        mTabLayout.getTabAt(0).setCustomView(view1);

        View view2 = getActivity().getLayoutInflater().inflate(R.layout.custom_tab, null);
        //view2.findViewById(R.id.icon).setBackgroundResource(R.drawable.ic_voucher_fisik);
        TextView tv2 = (TextView)view2.findViewById(R.id.tv);
        tv2.setText("Favorite");
        mTabLayout.getTabAt(1).setCustomView(view2);
    }

    private void setupViewPager(ViewPager viewPager) {
        VoucherPageAdapter adapter = new VoucherPageAdapter(getChildFragmentManager());
        adapter.addFragment(new ReedemFragment(), "Redeem");
        adapter.addFragment(new FavoriteFragment(), "Favorite");
        viewPager.setAdapter(adapter);
    }



}
