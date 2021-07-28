package com.gads.onlinelibrary.Services;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceBuilder {
    public static final String URL = "";
    public static Retrofit.Builder builder = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create());
    public static Retrofit retrofit = builder.build();
    public static <S> S buildservice(Class<S> servicetype){
        return retrofit.create(servicetype);
    }
}
