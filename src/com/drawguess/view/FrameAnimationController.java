
package com.drawguess.view;

import android.os.Handler;
import android.os.Message;

/**
 * 动画控制
 * @author copy from other
 *
 */
public class FrameAnimationController {
    private static class AnimationHandler extends Handler {
        @Override
		public void handleMessage(Message m) {
            switch (m.what) {
                case MSG_ANIMATE:
                    if (m.obj != null) {
                        ((Runnable) m.obj).run();
                    }
                    break;
            }
        }
    }

    public static final int ANIMATION_FRAME_DURATION = 1000 / 60;

    private static final Handler mHandler = new AnimationHandler();

    private static final int MSG_ANIMATE = 1000;

    public static void requestAnimationFrame(Runnable runnable) {
        Message message = new Message();
        message.what = MSG_ANIMATE;
        message.obj = runnable;
        mHandler.sendMessageDelayed(message, ANIMATION_FRAME_DURATION);
    }

    public static void requestFrameDelay(Runnable runnable, long delay) {
        Message message = new Message();
        message.what = MSG_ANIMATE;
        message.obj = runnable;
        mHandler.sendMessageDelayed(message, delay);
    }

    private FrameAnimationController() {
        throw new UnsupportedOperationException();
    }
}
