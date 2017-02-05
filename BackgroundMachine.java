/**
 * Created by admin on 2/5/2017.
 */
package com.grebz.grebzband.grebz;

import android.media.MediaPlayer;
import android.widget.ImageButton;

class BackgroundMachine {

    private int state;
    private MediaPlayer cops;
    private MediaPlayer bicycle;

    private RedBackground redBackground = new RedBackground();
    private YellowBackground yellowBackground = new YellowBackground();

    BackgroundMachine(MediaPlayer cops, MediaPlayer bicycle) {
        this.state = redBackground.get_background();
        this.cops = cops;
        this.bicycle = bicycle;
    }

    void change_background(ImageButton img_b_v) {
        if (state == redBackground.get_background()) {
            cops.pause();
            bicycle.start();
            state = yellowBackground.change_background(img_b_v);
        }
        else {
            bicycle.pause();
            cops.start();
            state = redBackground.change_background(img_b_v);
        }
    }
}
