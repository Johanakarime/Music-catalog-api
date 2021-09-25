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
* Nombre de archivo: Album.java
* Autor: johanama
* Fecha de creación: 18 sep. 2021
*/

package com.music.store.mx.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


/**
 * The Class Album.
 */
@Entity
@Table(name = "Album")
@Getter
@Setter
public class Album {

  /** The album id. */
  @Id
  @Column(name = "idAlbum")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long albumId;

  /** The title. */
  @Column(name = "titulo", nullable = false, length = 45)
  private String title;

  /** The launching. */
  @Column(name = "lanzamiento", nullable = false, length = 45)
  private Date launching;

  /** The label. */
  @Column(name = "disquera", nullable = false, length = 45)
  private String label;

  /** The singer. */
  @Column(name = "cantante", length = 45)
  private String singer;

  /** The gender. */
  @Column(name = "genero", length = 45)
  private String gender;

  /** The coverage. */
  @Column(name = "cobertura", length = 45)
  private String coverage;


}
