package nyc.c4q.ashiquechowdhury.midterm_practical.model;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ashiquechowdhury on 12/10/16.
 */

public interface VineAPI {
    @GET("api/timelines/users/918753190470619136")
    Call<VinePOJO> getVinePOJO();
}
