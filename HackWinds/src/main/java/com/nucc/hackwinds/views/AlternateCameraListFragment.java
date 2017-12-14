package com.nucc.hackwinds.views;


import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.appspot.hackwinds.camera.model.ModelCameraMessagesCameraMessage;
import com.nucc.hackwinds.R;
import com.nucc.hackwinds.adapters.AlternateCameraListAdapter;
import com.nucc.hackwinds.models.CameraModel;
import com.nucc.hackwinds.utilities.Extensions;

public class AlternateCameraListFragment extends ListFragment {

    private AlternateCameraListAdapter mAlternateCameraListAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CameraModel cameraModel = CameraModel.getInstance(getActivity().getApplicationContext());

        mAlternateCameraListAdapter = new AlternateCameraListAdapter(getActivity(), cameraModel);
        setListAdapter(mAlternateCameraListAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View V = inflater.inflate(R.layout.alternate_camera_list_fragment, container, false);

        return V;
    }

    @Override
    public void onResume() {
        super.onResume();

        AlternateCameraActivity alternateCameraActivity = (AlternateCameraActivity) getActivity();
        alternateCameraActivity.resetToolbarTitle();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        String locationName = mAlternateCameraListAdapter.getHeaderTitle(position);
        String cameraName = mAlternateCameraListAdapter.getItem(position);

        ModelCameraMessagesCameraMessage camera = CameraModel.getInstance(getActivity().getApplicationContext()).getCamera(locationName, cameraName);
        if (camera == null) {
            return;
        }

        if (Extensions.isImageOnlyCamera(camera)) {
            IsoCameraFragment cameraFragment = new IsoCameraFragment();
            cameraFragment.setCamera(camera);

            FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.content_frame, cameraFragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else {
            String url = "";
            if (Extensions.isVideoCamera(camera)) {
                url = camera.getVideoUrl();
            } else if (Extensions.isWebCamera(camera)) {
                url = camera.getWebUrl();
            } else {
                return;
            }

            CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
            builder.setToolbarColor(getResources().getColor(R.color.hackwinds_blue));
            builder.setSecondaryToolbarColor(getResources().getColor(R.color.white));
            builder.setShowTitle(true);
            CustomTabsIntent customTabsIntent = builder.build();
            customTabsIntent.launchUrl(getActivity(), Uri.parse(url));
        }
    }
}
