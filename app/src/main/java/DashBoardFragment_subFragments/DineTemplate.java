package DashBoardFragment_subFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sahil.mymallapplication.R;

import java.util.Objects;

public class DineTemplate extends Fragment {

    private static final String TAG = "MainActivity";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_dashborad_dine, container, false);


        ListView listView = view.findViewById(R.id.dineMenu);
        final String[] dineMenu = getResources().getStringArray(R.array.dine);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                Objects.requireNonNull(getActivity()),
                android.R.layout.simple_list_item_1,
                dineMenu
        );

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getActivity(),shopMenu[i],Toast.LENGTH_SHORT).show();
                Log.d(TAG, "Button at pos " + i + "is pressed as " + dineMenu[i]);
            }
        });

        return view;
    }

}
