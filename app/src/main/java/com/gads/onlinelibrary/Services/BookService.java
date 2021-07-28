package com.gads.onlinelibrary.Services;

import com.gads.onlinelibrary.Models.BooksModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BookService {
    @GET
    Call<BooksModel> getbooks();
}
