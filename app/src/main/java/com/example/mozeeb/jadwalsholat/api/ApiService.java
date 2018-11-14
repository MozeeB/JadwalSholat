package com.example.mozeeb.jadwalsholat.api;

import com.example.mozeeb.jadwalsholat.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("jakarta.json")
    Call<ModelJadwal>getJadwal();
}
