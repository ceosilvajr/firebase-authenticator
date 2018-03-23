/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.guice;

import com.ceosilvajr.microserviceauth.AbstractMicroServiceFilter;
import com.google.inject.Singleton;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by ceosilvajr
 *
 * @author ceosilvajr@gmail.com
 */
@Singleton
public class ServiceAuthorizationFilter extends AbstractMicroServiceFilter {

  @Override public boolean isAuthorized(final HttpServletRequest httpServletRequest) {
    return isAuthorizedService(httpServletRequest);
  }

  @Override public void init(final FilterConfig filterConfig) throws ServletException {
    // Intended to be empty
  }

  @Override public void destroy() {
    // Intended to be empty
  }
}
