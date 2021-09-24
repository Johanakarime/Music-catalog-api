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

package com.music.store.mx.application.service.impl;

import com.music.store.mx.application.dto.AlbumDto;
import com.music.store.mx.application.dto.SongDto;
import com.music.store.mx.application.repository.AlbumRepository;
import com.music.store.mx.application.repository.SongsRepository;
import com.music.store.mx.application.service.MusicStoreService;
import com.music.store.mx.model.Album;
import com.music.store.mx.model.Song;
import com.music.store.mx.application.mapper.AlbumMapper;
import com.music.store.mx.application.mapper.SongMapper;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class MusicStoreServiceImpl implements MusicStoreService {

  private AlbumRepository albumRepository;
  private SongsRepository songsRepository;

  public MusicStoreServiceImpl(AlbumRepository albumRepository, SongsRepository songsRepository) {

    this.albumRepository = albumRepository;
    this.songsRepository = songsRepository;
  }
  
  /**
   * Retrieve albums.
   *
   * @return the list
   */
  @Override
  public List<AlbumDto> retrieveAlbums() {
    return this.albumRepository.findAll().stream().map(AlbumMapper::toDto)
        .collect(Collectors.toList());
  }

  /**
   * Retrive songs.
   *
   * @return the list
   */
  @Override
  public List<com.music.store.mx.application.dto.SongDto> retrieveSongs() {

    return this.songsRepository.findAll().stream().map(SongMapper::toDto)
        .collect(Collectors.toList());
  }

  /**
   * Retrive songs.
   *
   * @param albumId the album id
   * @return the list
   */
  @Override
  public List<SongDto> retriveSongs(Long albumId) {
    return this.songsRepository.findByAlbumId(albumId).stream().map(SongMapper::toDto)
        .collect(Collectors.toList());
  }

  /**
   * Creates the album.
   *
   * @param albumDto the album dto
   */
  @Override
  public void createAlbum(AlbumDto albumDto) {
    Album album = new Album();
    album.setTitle(albumDto.getTitle());
    album.setLaunching(albumDto.getLaunching());
    album.setLabel(albumDto.getLabel());
    album.setSinger(albumDto.getSinger());
    album.setGender(albumDto.getGender());
    album.setCoverage(albumDto.getCoverage());

    albumRepository.save(album);

  }

  /**
   * Delete album.
   *
   * @param albumId the album id
   */
  @Override
  public void deleteAlbum(Long albumId) {
    albumRepository.deleteById(albumId);
  }

  /**
   * Update album.
   *
   * @param albumDto the album dto
   */
  @Override
  public void updateAlbum(AlbumDto albumDto) {
    java.util.Optional<Album> optionalAlbum = albumRepository.findById(albumDto.getAlbumId());
    if (optionalAlbum.isPresent()) {

      Album updateAlbum = optionalAlbum.get();
      updateAlbum.setTitle(albumDto.getTitle());
      updateAlbum.setLaunching(albumDto.getLaunching());
      updateAlbum.setLabel(albumDto.getLabel());
      updateAlbum.setSinger(albumDto.getSinger());
      updateAlbum.setGender(albumDto.getGender());
      updateAlbum.setCoverage(albumDto.getCoverage());

      albumRepository.save(updateAlbum);

    }

  }

  /**
   * Creates the song.
   *
   * @param songDto the song dto
   */
  @Override
  public void createSong(SongDto songDto) {
    Song song = new Song();

    song.setTitle(songDto.getTitle());
    song.setAlbumId(songDto.getAlbumId());
    song.setAuthor(songDto.getAuthor());
    song.setDuration(songDto.getDuration());

    songsRepository.save(song);

  }

  /**
   * Delete song.
   *
   * @param songId the song id
   */
  @Override
  public void deleteSong(Long songId) {
    songsRepository.deleteById(songId);

  }

  /**
   * Update song.
   *
   * @param songDto the song dto
   */
  @Override
  public void updateSong(SongDto songDto) {
    java.util.Optional<Song> optionalSong = songsRepository.findById(songDto.getSongId());
    if (optionalSong.isPresent()) {
      Song updateSong = optionalSong.get();
      updateSong.setTitle(songDto.getTitle());
      updateSong.setAlbumId(songDto.getAlbumId());
      updateSong.setAuthor(songDto.getAuthor());
      updateSong.setDuration(songDto.getDuration());

      songsRepository.save(updateSong);
    }

  }

  /**
   * Find album by id.
   *
   * @param albumId the album id
   * @return the album dto
   */
  @Override
  public AlbumDto retrieveAlbumById(Long albumId) {
    Optional<Album> album = this.albumRepository.findById(albumId);
    if (album.isPresent()) {
      return AlbumMapper.toDto(album.get());
    }

    return null;
  }

  /**
   * Delete songs.
   *
   * @param albumId the album id
   */
  @Override
  public void deleteSongs(Long albumId) {
    songsRepository.deleteAll(songsRepository.findByAlbumId(albumId));

  }

  /**
   * Delete albums.
   */
  @Override
  public void deleteAlbums() {
    albumRepository.deleteAll();
  }

  /**
   * Gets the song by id and album id.
   *
   * @param songId the song id
   * @param albumId the album id
   * @return the song by id and album id
   */
  @Override
  public Optional<SongDto> getSongByIdAlbumId(Long songId, Long albumId) {
    return this.songsRepository.findByIdAndAlbumId(songId, albumId).map(SongMapper::toDto);
  }

  /**
   * Update albums.
   *
   * @param label the label
   * @return the boolean
   */
  @Override
  public Boolean updateAlbums(String label) {
    if (this.retrieveAlbums() != null) {
      this.albumRepository.updateAlbum(label);
      return true;
    } else {
      return false;
    }
  }

  /**
   * Delete song id.
   *
   * @param songId the song id
   * @param albumId the album id
   * @return the boolean
   */
  @Override
  public Boolean deleteSong(Long songId, Long albumId) {

    if (this.getSongByIdAlbumId(songId, albumId).isPresent()) {
      this.songsRepository.deleteSong(songId, albumId);
      return true;
    } else {
      return false;
    }
  }
  
}