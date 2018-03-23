/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.service;

/**
 * Created date 22/01/2018
 *
 * @author ceosilvajr@gmail.com
 **/
public interface AuthenticatorService {

  Boolean isAuthorized(final String token);
}
