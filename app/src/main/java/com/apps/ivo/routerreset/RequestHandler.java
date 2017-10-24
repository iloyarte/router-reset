package com.apps.ivo.routerreset;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class RequestHandler {

    private static RequestHandler instance;
    private RequestQueue requestQueue;
    private Context mContext;
    private RequestHandler(){}

    public static RequestHandler getInstance(Context c){
        if (instance == null) instance = new RequestHandler();
        instance.mContext = c;
        return instance;
    }


    public RequestQueue getQueue(){
        // Instantiate the RequestQueue.
        if (requestQueue == null) requestQueue = Volley.newRequestQueue(instance.mContext);
        return requestQueue;
    }

}
