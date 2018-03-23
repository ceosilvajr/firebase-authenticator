/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.guice;

import com.google.api.server.spi.guice.EndpointsModule;
import com.ceosilvajr.firebase.authenticator.AppServlet;

/**
 * Created by ceosilvajr.
 *
 * @author ceosilvajr@gmail.com
 */
public class AppServletModule extends EndpointsModule {

  @Override protected final void configureServlets() {
    filter("/*").through(ServiceAuthorizationFilter.class);
    serve("/authenticate").with(AppServlet.class);
  }
}
