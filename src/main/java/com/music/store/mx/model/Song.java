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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "Cancion")
@Getter
@Setter
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idCancion", nullable = false, length = 11)
  private Long songId;

  @Column(name = "titulo", nullable = false, length = 45)
  private String title;

  @Column(name = "idAlbum", nullable = false, length = 11)
  private Long albumId;

  @Column(name = "autor", nullable = false, length = 11)
  private String author;

  @Column(name = "duracion", nullable = false)
  private Float duration;

}