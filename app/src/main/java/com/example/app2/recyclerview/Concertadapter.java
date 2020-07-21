package com.example.app2.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import com.example.app2.ConcertDetails;
import com.example.app2.R;
import com.example.app2.models.Concerts;

public class Concertadapter extends RecyclerView.Adapter<Concertadapter.concertviewholder> {

    private Context contx;
    private List<Concerts> data;

    public Concertadapter(Context contx, List<Concerts> data) {
        this.contx = contx;
        this.data = data;
    }


    @NonNull
    @Override
    public concertviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
       return new concertviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull concertviewholder holder, final int position) {
        final Concerts concert = data.get(position);
        holder.title.setText(concert.getTitle());
        holder.description.setText(concert.getDescription());
        holder.price.setText(concert.getPrice());
        holder.date.setText(concert.getDate());
        holder.artist_img.setImageDrawable(contx.getResources().getDrawable(concert.getImage()));

        holder.booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(contx.getApplicationContext(), ConcertDetails.class);
                intent.putExtra("title", data.get(position).title);
                intent.putExtra("description", data.get(position).description);
                intent.putExtra("price", data.get(position).price);
                intent.putExtra("image", data.get(position).image);
                intent.putExtra("date",data.get(position).date);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                contx.getApplicationContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class concertviewholder extends RecyclerView.ViewHolder{

        ImageView artist_img;
        TextView title, description, price, date;
        Button booking;
        public concertviewholder(@NonNull View itemView) {
            super(itemView);

            artist_img = itemView.findViewById(R.id.item_artist_img);
            title = itemView.findViewById(R.id.item_artist_title);
            description = itemView.findViewById(R.id.item_artist_description);
            price = itemView.findViewById(R.id.item_artist_price);
            date = itemView.findViewById(R.id.item_artist_date);
            booking = itemView.findViewById(R.id.item_artist_booking);
        }
    }
}
