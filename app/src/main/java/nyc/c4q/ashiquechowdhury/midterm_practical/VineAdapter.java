package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.ashiquechowdhury.midterm_practical.model.RecordList;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */
public class VineAdapter extends RecyclerView.Adapter<VineViewHolder> {
    List<RecordList> myList;

    public VineAdapter(List<RecordList> recordList) {
        myList = recordList;
    }

    @Override
    public VineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View childView = inflater.inflate(R.layout.vine_row, parent, false);
        return new VineViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(VineViewHolder holder, int position) {
        holder.bind(myList.get(position));
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }
}
