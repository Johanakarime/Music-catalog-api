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
* Nombre de archivo: ErrorResponse.java
* Autor: johanama
* Fecha de creación: 24 sep. 2021
*/


package com.music.store.mx.infraestructure.exceptions;

import lombok.AllArgsConstructor;

/**
 * The Class ErrorResponse.
 */
@AllArgsConstructor
public class ErrorResponse {

  /** The code. */
  private Integer code;

  /** The message. */
  private String message;

  /** The location. */
  private String location;

  /** The more info. */
  private String moreInfo;

}
