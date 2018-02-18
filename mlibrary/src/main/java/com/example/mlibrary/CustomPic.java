package com.example.mlibrary;

import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by sgorle on 2/18/18.
 */

public class CustomPic {

        public CustomPic(Context context, ImageView view)
        {
            Picasso.with(context).load("https://www.sideshowtoy.com/collectibles/dc-comics-batman-prime-1-studio-9032461/#").resize(120, 60).into(view);
        }
    }

