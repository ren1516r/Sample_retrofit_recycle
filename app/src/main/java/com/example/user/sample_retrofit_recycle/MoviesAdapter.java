package com.example.user.sample_retrofit_recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 3/18/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.viewData> {
private List<Movie> moviesList;
    private Context context;

    public MoviesAdapter(List<Movie> moviesList, Context context) {
        this.moviesList = moviesList;
        this.context = context;
    }



    @Override
    public MoviesAdapter.viewData onCreateViewHolder(ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_movie_item,parent,false);
        return new viewData(view);
    }

    @Override
    public void onBindViewHolder(MoviesAdapter.viewData holder, int position) {
        Log.d("Title",moviesList.get(position).getTitle());
        Log.d("Overview",moviesList.get(position).getOverview());
      //  Log.d("Adult", String.valueOf(moviesList.get(position).getAdult()));
        //Log.d("Video", String.valueOf(moviesList.get(position).getVideo()));
        //Log.d("popularity", String.valueOf(moviesList.get(position).getPopularity()));
        Log.d("Vote_averge", String.valueOf(moviesList.get(position).getVote_Average()));

   holder.title.setText(moviesList.get(position).getTitle());
        holder.description.setText(moviesList.get(position).getOverview());
      holder.rating.setText(moviesList.get(position).getVote_Average().toString());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

public  class viewData extends RecyclerView.ViewHolder {
private TextView title,subtitle,description,rating;
    private ImageView star;
    public viewData(View itemView) {
        super(itemView);

        title=(TextView)itemView.findViewById(R.id.title);
        subtitle=(TextView)itemView.findViewById(R.id.subtitle);
        description=(TextView)itemView.findViewById(R.id.description);
        rating=(TextView)itemView.findViewById(R.id.rating);

    }
}



}
