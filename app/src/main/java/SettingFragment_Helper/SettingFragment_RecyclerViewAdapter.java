package SettingFragment_Helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sahil.mymallapplication.R;

import java.util.List;

public class SettingFragment_RecyclerViewAdapter extends RecyclerView.Adapter<SettingFragment_RecyclerViewAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    public SettingFragment_RecyclerViewAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_setting, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ListItem listItem = listItems.get(i);

        viewHolder.textViewHead.setText(listItem.getHeading());

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You Clicked " + listItem.getHeading(), Toast.LENGTH_LONG).show();
                //From here it will be redirected to some Specific place on click of the sepcofoc view
            }
        });

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout linearLayout;
        TextView textViewHead;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewHead = itemView.findViewById(R.id.textViewHead);
            linearLayout = itemView.findViewById(R.id.linearLayout);
        }
    }

}
