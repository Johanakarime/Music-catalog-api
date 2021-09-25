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
* Nombre de archivo: MusicStoreInputException.java
* Autor: johanama
* Fecha de creación: 19 sep. 2021
*/

package com.music.store.mx.application.controller;

/**
 * The Class MusicStoreInputException.
 */
public class MusicStoreInputException extends RuntimeException {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -193512243192091891L;
  
  /**
   * Instantiates a new music store input exception.
   *
   * @param message the message
   */
  public MusicStoreInputException(String message) {
    super(message);
  }
}
