package com.mg.axe.retrofit2_rxjava2.block;

import com.mg.axe.retrofit2_rxjava2.bean.ResultBean;
import com.mg.axe.retrofit2_rxjava2.network.response.Response;

import io.reactivex.Observable;
import okhttp3.RequestBody;


/**
 * Created by Zaifeng on 2018/3/1.
 */

public class Contract {

    public interface Persenter {
         void getCarList(String userId);
    }

    public interface View {
        void getDataSuccess();
        void getDataFail();
    }

    public interface Model {
         Observable<Response<ResultBean>> getCarList(RequestBody body);
    }

}
