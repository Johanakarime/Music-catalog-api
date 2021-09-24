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
* Fecha de creación: 18 sep 2021
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


@Entity
@Table(name = "Album")
@Getter
@Setter
public class Album {

  @Id
  @Column(name = "idAlbum")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long albumId;

  @Column(name = "titulo", nullable = false, length = 45)
  private String title;

  @Column(name = "lanzamiento", nullable = false, length = 45)
  private Date launching;

  @Column(name = "disquera", nullable = false, length = 45)
  private String label;

  @Column(name = "cantante", length = 45)
  private String singer;

  @Column(name = "genero", length = 45)
  private String gender;

  @Column(name = "cobertura", length = 45)
  private String coverage;


}
