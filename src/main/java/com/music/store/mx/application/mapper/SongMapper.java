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
* Nombre de archivo: SongMapper.java
* Autor: johanama
* Fecha de creación: 18 sep. 2021
*/

package com.music.store.mx.application.mapper;

import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.model.Song;

/**
 * The Class SongMapper.
 */
public class SongMapper {

  /**
   * Instantiates a new song mapper.
   */
  private SongMapper() {
    super();
  }

  /**
   * To model.
   *
   * @param songDto the song dto
   * @return the song
   */
  public static Song toModel(SongDto songDto) {

    Song song = new Song();

    song.setTitle(songDto.getTitle());
    song.setAlbumId(songDto.getAlbumId());
    song.setDuration(songDto.getDuration());
    song.setAuthor(songDto.getAuthor());
    return song;

  }

  /**
   * To dto.
   *
   * @param song the song
   * @return the song dto
   */
  public static SongDto toDto(Song song) {

    return SongDto.builder().songId(song.getSongId()).title(song.getTitle())
        .albumId(song.getAlbumId()).duration(song.getDuration()).author(song.getAuthor()).build();

  }

}
