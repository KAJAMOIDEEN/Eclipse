package com.music.playlist.controller;

import com.music.playlist.dto.PlayListRequest;
import com.music.playlist.model.PlayList;
import com.music.playlist.service.PlayListService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/playlists")
public class PlayListController {
    
	 private final PlayListService playListService;

	 @Autowired
	 public PlayListController(PlayListService playListService) {
	    this.playListService = playListService;
	 }


    @PostMapping(" ")
    public ResponseEntity<PlayList> createPlayList(@RequestBody PlayListRequest playListRequest){
        PlayList createPlayList = playListService.createPlayList(playListRequest);
    	return new ResponseEntity<PlayList> (createPlayList,HttpStatus.CREATED);
    }

    @GetMapping("/{playListId}")
    public ResponseEntity<PlayList> getPlayListById(@PathVariable Long playListId){
    	 try {
             PlayList playList = playListService.getPlayListByID(playListId);
             return ResponseEntity.ok(playList);
         } 
    	 catch (Exception e) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
         }
    }

    @GetMapping(" ")
    public ResponseEntity<List<PlayList>> getAllPlayLists(){
    	List<PlayList> playLists = playListService.getPlayLists(); 
        return ResponseEntity.ok(playLists);
    }

    @DeleteMapping("/{playListId}")
    public ResponseEntity<Void> deletePlayList(@PathVariable Long playListId){
    	try {
            playListService.deletePlayList(playListId);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
