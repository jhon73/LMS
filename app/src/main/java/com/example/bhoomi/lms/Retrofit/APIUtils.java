package com.example.bhoomi.lms.Retrofit;

public class APIUtils {


    public  static APIService getAPIService() {
        return RetrofitClient.getClient(Config.BASE_URL).create(APIService.class);
    }
}
