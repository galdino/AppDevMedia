package app.devmedia.com.br.appdevmedia;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

/**
 * Created by fernando.fgsf on 04/07/2016.
 */
public class DevMediaApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SystemClock.sleep(TimeUnit.SECONDS.toMillis(3));
    }
}
