/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Created by ceosilvajr on 06/08/2016.
 *
 * @author ceosilvajr@gmail.com
 */
public class AppGuiceFilter extends GuiceServletContextListener {

  @Override protected final Injector getInjector() {
    return Guice.createInjector(new AppServletModule(), new AppFirebaseModule());
  }
}
