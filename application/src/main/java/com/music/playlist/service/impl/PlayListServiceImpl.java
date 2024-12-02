package com.music.playlist.service.impl;

import com.music.playlist.dto.PlayListRequest;
import com.music.playlist.model.PlayList;
import com.music.playlist.repository.PlayListRepository;
import com.music.playlist.service.PlayListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PlayListServiceImpl implements PlayListService {
    @Autowired
    private PlayListRepository playListRepository;
    

    public PlayListServiceImpl(PlayListRepository playListRepository) {
        this.playListRepository = playListRepository;
    }

    @Override
    public PlayList createPlayList(PlayListRequest playListRequest) {
        if (playListRequest == null) {
            throw new IllegalArgumentException("PlayListRequest cannot be null.");
        }
        PlayList playList = new PlayList();
        playList.setName(playListRequest.name()); 
        playList.setTracksCount(playListRequest.tracksCount()); 
        playList.setCreatedDate(new Date()); 

        return playListRepository.save(playList);
    }

    @Override
    public List<PlayList> getPlayLists() {
        return playListRepository.findAll();
    }

    @Override
    public PlayList getPlayListByID(Long id) {
    	 Optional<PlayList> opt = playListRepository.findById(id);
         if (opt.isPresent())
             return opt.get();
         else
             return null;
    }

    @Override
    public void deletePlayList(Long id) {
       playListRepository.deleteById(id);
    }

}
