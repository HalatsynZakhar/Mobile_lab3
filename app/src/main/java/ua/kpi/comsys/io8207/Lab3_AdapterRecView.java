package ua.kpi.comsys.io8207;

import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.NonNull;
import java.util.List;

public class Lab3_AdapterRecView extends RecyclerView.Adapter<Lab3_AdapterRecView.MyViewHolder> {
    Context mContext;
    List<Lab3_Book> mData;

    public Lab3_AdapterRecView(Context mContext, List<Lab3_Book> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.lab3_book_item, parent, false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.text1.setText(mData.get(position).getText1());
        holder.text2.setText(mData.get(position).getText2());
        holder.text3.setText(mData.get(position).getText3());
        holder.img.setImageResource(mData.get(position).getImageBook());
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView text1;
        private TextView text2;
        private TextView text3;
        private ImageView img;

        public MyViewHolder(View itemView) {
            super(itemView);

            text1 = itemView.findViewById(R.id.text1_id);
            text2 = itemView.findViewById(R.id.text2_id);
            text3 = itemView.findViewById(R.id.text3_id);
            img = itemView.findViewById(R.id.image_id);
        }
    }
}