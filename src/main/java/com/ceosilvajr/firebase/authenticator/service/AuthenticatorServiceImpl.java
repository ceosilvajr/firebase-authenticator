/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.inject.Singleton;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

/**
 * Created date 22/01/2018
 *
 * @author ceosilvajr@gmail.com
 **/
@Singleton
public class AuthenticatorServiceImpl implements AuthenticatorService, Serializable {

  private static final long serialVersionUID = -4975348012367868076L;

  @Override public Boolean isAuthorized(final String token) {
    try {
      FirebaseAuth.getInstance().verifyIdTokenAsync(token).get();
    } catch (final InterruptedException | ExecutionException e) {
      return Boolean.FALSE;
    }
    return Boolean.TRUE;
  }
}
