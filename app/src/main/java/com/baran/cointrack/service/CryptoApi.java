package com.baran.cointrack.service;

import com.baran.cointrack.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoApi {

    // GET, POST, UPDATE, DELETE
    // URL BASE -> www.website.com
    // GET -> price?key=xxx
    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
