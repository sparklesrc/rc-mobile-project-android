package pe.com.sparkles.service;

import pe.com.sparkles.model.HolaResponse;
import pe.com.sparkles.model.LugarRequest;
import pe.com.sparkles.model.LugarResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by SPARKLES on 06/09/2017.
 */

public interface ApiService {

    @POST("/projectrc/test/holaMundo")
    @FormUrlEncoded
    Call<HolaResponse> getHolaMundo(@Field("hola") String hola);

    @POST("/projectrc/rest/lugar/listByDefault")
    Call<LugarResponse> getLugares(@Body LugarRequest lugarRequest);
}
