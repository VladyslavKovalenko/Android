/**
 * Created by admin on 2/5/2017.
 */

package com.grebz.grebzband.grebz;

import android.widget.ImageButton;

class YellowBackground implements State {

    private int background;

    YellowBackground() {
        background = R.drawable.yellow;
    }

    public int get_background() {
        return background;
    }

    public int change_background(ImageButton img_b_v) {
        img_b_v.setBackgroundResource(background);
        return get_background();
    }
}
