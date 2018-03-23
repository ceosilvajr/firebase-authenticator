/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.guice;

import com.google.api.server.spi.guice.EndpointsModule;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.ceosilvajr.firebase.authenticator.helpers.AppConfig;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by ceosilvajr.
 *
 * @author ceosilvajr@gmail.com
 */
public class AppFirebaseModule extends EndpointsModule {

  private static final Logger LOGGER = Logger.getLogger(AppFirebaseModule.class.getName());

  @Override protected final void configureServlets() {
    try {
      final GoogleCredentials credentials = GoogleCredentials.fromStream(getServletContext()
          .getResourceAsStream(AppConfig.FIREBASE_SERVICE_CREDENTIALS_PATH.getValue()));
      final FirebaseOptions options = new FirebaseOptions.Builder()
          .setCredentials(credentials)
          .setDatabaseUrl(AppConfig.FIREBASE_HOST.getValue())
          .build();
      FirebaseApp.initializeApp(options);
    } catch (final IOException e) {
      LOGGER.severe(e.getMessage());
    }
  }
}
