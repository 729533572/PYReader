package com.neuroandroid.pyreader.ui.fragment;

import com.neuroandroid.pyreader.R;
import com.neuroandroid.pyreader.base.BaseFragment;
import com.neuroandroid.pyreader.ui.activity.MainActivity;
import com.neuroandroid.pyreader.utils.UIUtils;

/**
 * Created by NeuroAndroid on 2017/6/28.
 */

public class RankingFragment extends BaseFragment implements MainActivity.MainActivityFragmentCallbacks {
    @Override
    protected int attachLayoutRes() {
        return R.layout.fragment_ranking;
    }

    @Override
    protected void initView() {
        setDisplayHomeAsUpEnabled();
        setToolbarTitle(UIUtils.getString(R.string.ranking));
    }

    @Override
    public boolean handleBackPress() {
        return false;
    }
}