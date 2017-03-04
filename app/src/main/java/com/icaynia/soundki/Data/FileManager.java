package com.icaynia.soundki.Data;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import com.icaynia.soundki.Model.PlayList;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by icaynia on 01/03/2017.
 */

public class FileManager
{
    public Context context;
    public String TAG = "FileManager";

    String dirPath;

    public FileManager(Context context)
    {
        init();
    }

    public void init()
    {
        dirPath = context.getFilesDir().getPath();
        File file = new File(dirPath);
        if( !file.exists() ) {
            file.mkdirs();
        }
        file = new File(dirPath+"/playlist");
        if( !file.exists() ) {
            file.mkdirs();
        }
    }

    public void savePlaylist(PlayList playlist)
    {
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dg.ser"));
            oos.writeObject(playlist);
            oos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

