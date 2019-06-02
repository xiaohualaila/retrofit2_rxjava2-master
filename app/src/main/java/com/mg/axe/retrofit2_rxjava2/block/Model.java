package com.mg.axe.retrofit2_rxjava2.block;

import com.mg.axe.retrofit2_rxjava2.bean.ResultBean;
import com.mg.axe.retrofit2_rxjava2.network.response.Response;
import com.mg.axe.retrofit2_rxjava2.network.NetWorkManager;
import io.reactivex.Observable;
import okhttp3.RequestBody;


/**
 * Created by Zaifeng on 2018/3/1.
 */

public class Model implements Contract.Model {
    @Override
    public Observable<Response<ResultBean>> getCarList(RequestBody body) {
        return NetWorkManager.getRequest().getDataForBody(body);
    }

}
