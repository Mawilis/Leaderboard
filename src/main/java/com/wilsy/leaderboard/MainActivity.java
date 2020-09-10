package com.wilsy.leaderboard;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.google.android.material.tabs.TabLayout;
import com.wilsy.leaderboard.data.remote.controller.LearningLeadersController;
import com.wilsy.leaderboard.ui.main.SectionsPagerAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    //     https://gadsapi.herokuapp.com
//    private RequestQueue mRequestQueue;
    RequestQueue mQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new


//        mRequestQueue = Volley.newRequestQueue(this);
                mQueue = LearningLeadersController.getInstance(this.getApplicationContext())
                .getRequestQueue();
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);


        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,
                "https://gadsapi.herokuapp.com/api/hours", null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(i);
                                Log.d("JSonArray", "onResponse: "
                                        + jsonObject.getString("name") +
                                        " " + jsonObject.getString("hours") +
                                        " " + jsonObject.getString("country") +
                                        " " + jsonObject.getString("badgeUrl")
                                );
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        mQueue.add(jsonArrayRequest);
//        mRequestQueue.add(jsonArrayRequest);
    }
}