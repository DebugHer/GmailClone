package com.example.aadegoke.gmailclone.api;

import com.example.aadegoke.gmailclone.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by a.adegoke on 6/8/2018.
 */

public interface ApiInterface {
    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
