package com.wilsy.leaderboard.data.remote.controller;

import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

//
// Created by Wilson Khanyezi on 2020/09/09.
//
class HoursBank {
    ArrayList<HoursBank> mHoursBankArrayList = new ArrayList<>();

    private String url = "https://gadsapi.herokuapp.com/api/hours";


    public List<HoursBank> getHours() {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                Request.Method.GET,
                url,
                null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d("JSON", "onResponse: " + response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        });
        LearningLeadersController.getInstance().addToRequestQueue(jsonArrayRequest);
        return null;
    }


}
