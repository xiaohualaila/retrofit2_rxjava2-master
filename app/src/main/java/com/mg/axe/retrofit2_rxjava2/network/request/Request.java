package com.mg.axe.retrofit2_rxjava2.network.request;

import com.mg.axe.retrofit2_rxjava2.bean.JavaBean;
import com.mg.axe.retrofit2_rxjava2.bean.ResultBean;
import com.mg.axe.retrofit2_rxjava2.network.response.Response;
import com.mg.axe.retrofit2_rxjava2.bean.WeatherBean;

import java.util.List;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Zaifeng on 2018/2/28.
 * 封装请求的接口
 */

public interface Request {

    String HOST = "https://cloud.zq12369.com/nodeapi/";

    @POST("?service=User.getList")
    Observable<Response<List<JavaBean>>> getList(@Query("userId") String userId);

    @GET("api")
    Observable<WeatherBean> getWeatherDataForQuery(@Query("version") String version, @Query("city") String city);

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST("nkcleartext")
    Observable<Response<ResultBean>> getDataForBody(@Body RequestBody body);//首页文章列表
}
