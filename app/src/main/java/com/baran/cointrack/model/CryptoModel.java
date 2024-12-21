package com.baran.cointrack.model;

import com.google.gson.annotations.SerializedName;

public class CryptoModel {

    @SerializedName("currency")
    public String curr;
    @SerializedName("price")
    public String prc;
}
