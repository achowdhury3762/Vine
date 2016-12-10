package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.ashiquechowdhury.midterm_practical.model.RecordList;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */
public class VineViewHolder extends RecyclerView.ViewHolder{
    TextView usernameView;

    public VineViewHolder(View itemView) {
        super(itemView);
        usernameView = (TextView) itemView.findViewById(R.id.username_View);
    }

    public void bind(RecordList recordList) {
        try{
            String username = recordList.getRepost().getUser().getUsername();
            usernameView.setText(username);
        }
        catch(NullPointerException e){
            usernameView.setText("NULL");
        }
    }
}
