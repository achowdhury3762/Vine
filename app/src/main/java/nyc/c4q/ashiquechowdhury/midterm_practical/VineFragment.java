package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.ashiquechowdhury.midterm_practical.model.RecordList;
import nyc.c4q.ashiquechowdhury.midterm_practical.model.VineAPI;
import nyc.c4q.ashiquechowdhury.midterm_practical.model.VinePOJO;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */

public class VineFragment extends Fragment {
    RecyclerView mRecyclerView;
    private static final String BASE_URL = "https://vine.co/";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_rview, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.vineRecycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        callRetrofitOnWebsite();
        return view;
    }

    private void callRetrofitOnWebsite() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        VineAPI vineAPI = retrofit.create(VineAPI.class);

        Call<VinePOJO> service = vineAPI.getVinePOJO();
        service.enqueue(new Callback<VinePOJO>() {
            @Override
            public void onResponse(Call<VinePOJO> call, Response<VinePOJO> response) {
                VinePOJO myVine = response.body();
                Log.d("Number of Items", String.valueOf(myVine.getData().getCount()));
                List<RecordList> recordList = myVine.getData().getVineRecordList();
                mRecyclerView.setAdapter(new VineAdapter(recordList));
            }

            @Override
            public void onFailure(Call<VinePOJO> call, Throwable t) {}
        });
    }

}
