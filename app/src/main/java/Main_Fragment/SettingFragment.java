package Main_Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.sahil.mymallapplication.R;

import SettingFragment_Helper.GridAdapter;


public class SettingFragment extends Fragment {

    private final static String TAG = "MainActivity";
    String[] values = {
            "Direction",
            "Offers",
            "Calendar",
            "service",
            "Mall info",
            "Profile",
            "Delivary",
            "Valet"
    };

    int[] images = {R.drawable.setting_direction,
            R.drawable.setting_offers,
            R.drawable.setting_calender,
            R.drawable.setting_service,
            R.drawable.setting_mall_info,
            R.drawable.setting_profile,
            R.drawable.setting_dilivery,
            R.drawable.setting_valet
    };


    GridView gridView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        gridView = view.findViewById(R.id.gridView);
        GridAdapter gridAdapter = new GridAdapter(getActivity(), values, images);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d(TAG, "You have pressed " + values[i]);
            }
        });


        return view;
    }
}
