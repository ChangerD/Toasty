package es.dmoral.toasty;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/18 0018.
 */

public class MyToast {
    private static Context context;
    private static boolean isDebug;
    private static Handler mainHanlder;

    private static Handler getMainHanlder(){
        if(mainHanlder == null){
            mainHanlder = new Handler(Looper.getMainLooper());
        }
        return mainHanlder;
    }

    private static boolean isMainThread(){
        long threadId = Thread.currentThread().getId();
        if(context  == null){
            return false;
        }
        long mainThreadId = context.getMainLooper().getThread().getId();
        return threadId == mainThreadId;
    }

    private static void runSafe(Runnable runnable){
        if(isMainThread()){
            runnable.run();
        }else {
            getMainHanlder().post(runnable);
        }
    }

    /**
     *
     * @param context applicationcontext
     * @param isDebug 是测试环境还是正式环境
     * @param showInCenter 显示在什么地方.默认在底部,可以设置为屏幕中央.全局起作用
     */
    public static void init(Context context,boolean isDebug,boolean showInCenter){
        MyToast.context = context;
        MyToast.isDebug = isDebug;
        Toasty.isCenter = showInCenter;

    }

    public static void success(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.success(context, text, Toast.LENGTH_SHORT, true).show();
            }
        });

    }

    public static void error(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.error(context, text, Toast.LENGTH_SHORT, true).show();
            }
        });

    }

    public static void info(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.info(context, text, Toast.LENGTH_SHORT, true).show();
            }
        });

    }
    public static void warn(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.warning(context, text, Toast.LENGTH_SHORT, true).show();
            }
        });

    }
    public static void show(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.normal(context, text, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public static void show(final CharSequence text , final int resId){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.normal(context, text, context.getResources().getDrawable(resId)).show();
            }
        });

    }



    public static void debug(CharSequence text) {
        if(isDebug){
            show(text);
        }

    }

    public static void successBig(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.successBig(context, text, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public static void errorBig(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.errorBig(context, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static void successL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.success(context, text, Toast.LENGTH_LONG, true).show();
            }
        });

    }

    public static void errorL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.error(context, text, Toast.LENGTH_LONG, true).show();
            }
        });

    }

    public static void infoL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.info(context, text, Toast.LENGTH_LONG, true).show();
            }
        });

    }
    public static void warnL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.warning(context, text, Toast.LENGTH_LONG, true).show();
            }
        });

    }
    public static void showL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.normal(context, text, Toast.LENGTH_LONG).show();
            }
        });

    }




    public static void debugL(CharSequence text) {
        if(isDebug){
            showL(text);
        }

    }

    public static void successBigL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.successBig(context, text, Toast.LENGTH_LONG).show();
            }
        });

    }

    public static void errorBigL(final CharSequence text){
        runSafe(new Runnable() {
            @Override
            public void run() {
                Toasty.errorBig(context, text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
