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
package com.music.store.mx.application.mapper;

import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

public class SongMapper {

  private SongMapper() {
    super();
  }

  public static Song toModel(SongDto songDto) {

    Song song = new Song();

    song.setTitle(songDto.getTitle());
    song.setAlbumId(songDto.getAlbumId());
    song.setDuration(songDto.getDuration());
    song.setAuthor(songDto.getAuthor());
    return song;

  }

  public static SongDto toDto(Song song) {

    return SongDto.builder().songId(song.getSongId()).title(song.getTitle())
        .albumId(song.getAlbumId()).duration(song.getDuration()).author(song.getAuthor()).build();

  }

}
