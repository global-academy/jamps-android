package scom.p.m.a.j.jamps;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by Daniel on 8/30/2015.
 */
public class JAMPSApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.enableLocalDatastore(getApplicationContext());
        // Add your initialization code here
        Parse.initialize(this, "HPjhF9QBvFKLXN4uzPXtZVhyvg21LQXpvduvtZ43", "M21rgXWzd5u9qMh3yvNcVQCo2HCO4YONoaPvw2C5");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }


}
