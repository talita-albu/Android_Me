package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;


/**
 * Created by 155 X-MX on 22/04/2018.
 */

public class MasterListFragment extends Fragment {

    private MasterListAdapter mAdapter;
    private GridView grid;

    public MasterListFragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);
        grid = (GridView) rootView.findViewById(R.id.gird_view_images);



        mAdapter = new MasterListAdapter(this.getContext(), AndroidImageAssets.getAll());
        grid.setAdapter(mAdapter);

        return rootView;
    }
}
