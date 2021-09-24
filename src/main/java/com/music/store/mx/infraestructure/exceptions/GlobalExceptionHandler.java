/* 
* This program is free software: you can redistribute it and/or modify  
* it under the terms of the GNU General Public License as published by  
* the Free Software Foundation, version 3.
*
* This program is distributed in the hope that it will be useful, but 
* WITHOUT ANY WARRANTY; without even the implied warranty of 
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
* General Public License for more details.
*
* Nombre de archivo: ApplicationController.java
* Autor: johanama
* Fecha de creación: 20 sep 2021
*/

package com.music.store.mx.infraestructure.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.music.store.mx.application.controller.MusicStoreInputException;

public class GlobalExceptionHandler {

  @ExceptionHandler({MusicStoreInputException.class})

  public ResponseEntity<ErrorResponse> badRequest(
      MusicStoreInputException musicStoreInputException) {
    return new ResponseEntity<>(new ErrorResponse(1001, musicStoreInputException.getMessage(),
        "input validation", "valores incorrectos"),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler({Exception.class})
  public ResponseEntity<ErrorResponse> internalServerException(Exception serverException) {
    return new ResponseEntity<>(
        new ErrorResponse(9999, serverException.getMessage(), "error", null),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
