/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator.helpers;

/**
 * Created by ceosilvajr on 03/09/2016.
 *
 * @author ceosilvajr@gmail.com
 */
public enum AppConfig {

  FIREBASE_SERVICE_CREDENTIALS_PATH(System.getProperty("firebase.credentials.path")),
  FIREBASE_HOST(System.getProperty("firebase.host"));

  private final String value;

  AppConfig(final String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
