package com.example.lugaresturist.api;

import com.example.lugaresturist.entity.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("/products/")
    public abstract Call<List<Product>> listaProductos();

}