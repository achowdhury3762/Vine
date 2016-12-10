package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */

public class VineFragment extends Fragment {
    RecyclerView mRecyclerView;
    private static final String BASE_URL = "https://vine.co/api/timelines/users/918753190470619136/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_rview, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.vineRecycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        return view;
    }

}
