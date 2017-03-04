package com.icaynia.soundki.Data;

import android.content.Context;

import com.icaynia.soundki.Model.PlayList;

import java.util.ArrayList;

/**
 * Created by icaynia on 14/02/2017.
 *
 * 플레이 리스트를 관리하는 곳.
 */

public class PlayListManager
{
    private Context context;
    private String TAG = "PlayListManager";

    private FileManager fileManager;

    public PlayListManager(Context context)
    {
        this.context = context;
        init();
    }

    // TODO Initialize object.
    public void init()
    {
        fileManager = new FileManager(context);
    }

    public ArrayList<String> getPlayListList()
    {
        ArrayList<String> playListList = new ArrayList<String>();
        playListList.add("TEST_playlist");
        return playListList;
    }

    // TODO Get playlist from local
    public PlayList getPlayList(String playlistName)
    {
        return fileManager.loadPlayList(playlistName);
    }

    // TODO Save playlist to local
    public void savePlayList(PlayList playlist)
    {
        fileManager.savePlaylist(playlist);
    }



}
