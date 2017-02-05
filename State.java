/**
 * Created by admin on 2/5/2017.
 */

package com.grebz.grebzband.grebz;

import android.widget.ImageButton;

interface State {
    int get_background();

    int change_background(ImageButton b_img);
}
