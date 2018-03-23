/*
 * Copyright (c) 2018. ceosilvajr All rights reserved
 */

package com.ceosilvajr.firebase.authenticator;

import com.ceosilvajr.microserviceauth.config.MicroServiceConstants;
import com.ceosilvajr.servletutil.HttpResponseCodes;
import com.ceosilvajr.servletutil.ServletResponseUtility;
import com.ceosilvajr.servletutil.dto.ErrorResponse;
import com.ceosilvajr.servletutil.dto.SuccessResponse;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.ceosilvajr.firebase.authenticator.helpers.AppMessages;
import com.ceosilvajr.firebase.authenticator.service.AuthenticatorServiceImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created date 22/01/2018
 *
 * @author ceosilvajr@gmail.com
 **/
@Singleton
public class AppServlet extends HttpServlet {

  private static final long serialVersionUID = -1552498355778601292L;

  @Inject private AuthenticatorServiceImpl authenticatorService;

  @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    final String token = req.getParameter("token");
    if (authenticatorService.isAuthorized(token)) {
      ServletResponseUtility.instanceOf(resp, new SuccessResponse.Builder(HttpResponseCodes.RC_OK,
          AppMessages.SUCCESS_MESSAGE).build()).toJson();
    } else {
      ServletResponseUtility.instanceOf(resp, new ErrorResponse.Builder(HttpResponseCodes.RC_UNAUTHORIZED,
          MicroServiceConstants.UNAUTHORIZED_ERROR_CODE, MicroServiceConstants.UNAUTHORIZED_ERROR_MESSAGE).build())
          .toJson();
    }
  }
}
