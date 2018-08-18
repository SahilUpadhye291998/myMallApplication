package HomeFragment_Helper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sahil.mymallapplication.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HomeFragment_RecyclerViewAdapter extends RecyclerView.Adapter<HomeFragment_RecyclerViewAdapter.ViewHolder> {

    public HomeFragment_RecyclerViewAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final ListItem listItem = listItems.get(i);

        viewHolder.textViewHead.setText(listItem.getHead());
        viewHolder.textViewDesc.setText(listItem.getDesc());

        Picasso.with(context).load(listItem.getImageURL()).into(viewHolder.imageView);

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,"You Clicked "+listItem.getHead(),Toast.LENGTH_LONG).show();
            //From here it will be redirected to some Specific place on click of the sepcofoc view
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textViewHead;
        public TextView textViewDesc;
        public ImageView imageView;
        public LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDesc = (TextView) itemView.findViewById(R.id.textViewDesc);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayout);
        }
    }
    private List<ListItem> listItems;
    private Context context;
}
