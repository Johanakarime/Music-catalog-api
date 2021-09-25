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
* Nombre de archivo: AlbumRepository.java
* Autor: johanama
* Fecha de creación: 18 sep. 2021
*/

package com.music.store.mx.application.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;


/**
 * The Interface AlbumRepository.
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

  /**
   * Find all.
   *
   * @return the list
   */
  List<Album> findAll();

  /**
   * Update album.
   *
   * @param label the label
   */
  @Transactional
  @Modifying
  @Query(value = "UPDATE Album set disquera = ?", nativeQuery = true)
  void updateAlbum(String label);


}
