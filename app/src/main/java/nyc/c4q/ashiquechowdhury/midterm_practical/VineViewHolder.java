package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.ashiquechowdhury.midterm_practical.model.RecordList;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */
public class VineViewHolder extends RecyclerView.ViewHolder{
    TextView usernameView;
    TextView likesView;

    public VineViewHolder(View itemView) {
        super(itemView);
        usernameView = (TextView) itemView.findViewById(R.id.username_View);
        likesView = (TextView) itemView.findViewById(R.id.likes_view);
    }

    public void bind(RecordList recordList) {
        try{
            String username = recordList.getRepost().getUser().getUsername();
            usernameView.setText(username);
            String color = "#" + recordList.getRepost().getProfileBackground().substring(2);
            itemView.setBackgroundColor(Color.parseColor(color));
            likesView.setText("Likes : " + String.valueOf(recordList.getLiked()));
        }
        catch(NullPointerException e){
            usernameView.setText("NULL");
            itemView.setBackgroundColor(Color.DKGRAY);
        }
    }
}
