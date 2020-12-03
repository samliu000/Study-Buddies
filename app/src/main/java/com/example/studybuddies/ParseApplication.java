package com.example.studybuddies;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("T0NWin1GfMkAQebeYJKLquijs1y5DaDnw8FRjHKW")
                .clientKey("z9l88s1wWGQdK2gM1T1STrcdeNYWz3hUxlTnNb81")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
