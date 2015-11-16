package org.jiangtao.utils;

import android.util.Log;

/**
 * Created by mr-jiang on 15-11-6.
 * 这是实现的一个关于自己的自定义日志
 * 当程序开发完毕时，只需要修改一下静态常量
 * 就可以实现不打印测试功能
 */
public class LogUtils {
    public static final int VERBOSE = 1;

    public static final int DEBUG = 2;

    public static final int INFO = 3;

    public static final int WARN = 4;

    public static final int ERROR = 5;
    /**
     * 更改level等级，实现不打印
     */
    public static final int NOTHING = 6;

    public static final int LEVEL = VERBOSE;

    public static void v(String tag, String msg) {
        if (LEVEL <= VERBOSE) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LEVEL <= DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LEVEL <= INFO) {
            Log.i(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LEVEL <= WARN) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LEVEL <= ERROR) {
            Log.e(tag, msg);
        }
    }
}
