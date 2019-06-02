package com.mg.axe.retrofit2_rxjava2.bean;

import java.util.List;

public class ResultBean {
    /**
     * success : true
     * data : [{"title":"赣州智能产业创新研究院揭牌","url":"https://mp.weixin.qq.com/s/2xBbMvLqsi9BU3rhB3Zpeg"},{"title":"习近平在赣州经开区考察调研","url":"https://mp.weixin.qq.com/s/7hCta0fYu76NGBW8xr42qw"},{"title":"第一批！152家家具企业拟使用\u201c南康家具\u201d集体商标，有你们公司吗？","url":"https://mp.weixin.qq.com/s/vZ1MHimk3p3GcOlkVxlF3w"},{"title":"中国家具智能制造创新中心在南康家居小镇揭牌成立","url":"https://mp.weixin.qq.com/s/aL88LKlcpK3Rqf_sj2GExQ"}]
     */

    private boolean success;
    private List<DataBean> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : 赣州智能产业创新研究院揭牌
         * url : https://mp.weixin.qq.com/s/2xBbMvLqsi9BU3rhB3Zpeg
         */

        private String title;
        private String url;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "success=" + success +
                ", data=" + data +
                '}';
    }
}
