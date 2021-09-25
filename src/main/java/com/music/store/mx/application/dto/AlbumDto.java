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
* Nombre de archivo: AlbumDto.java
* Autor: johanama
* Fecha de creación: 18 sep. 2021
*/

package com.music.store.mx.application.dto;

import java.sql.Date;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * The Class AlbumDto.
 */
@Getter
@Setter
@Builder
public class AlbumDto {

  /** The album id. */
  private Long albumId;
  
  /** The title. */
  private String title;
  
  /** The launching. */
  private Date launching;
  
  /** The label. */
  private String label;
  
  /** The singer. */
  private String singer;
  
  /** The gender. */
  private String gender;
  
  /** The coverage. */
  private String coverage;

}
