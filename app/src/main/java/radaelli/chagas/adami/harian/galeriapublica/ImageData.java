package radaelli.chagas.adami.harian.galeriapublica;

import android.graphics.Bitmap;
import android.net.Uri;

import java.util.Date;


public class ImageData {
    public Uri uri;
    public Bitmap thumb;
    public String fileName;
    public Date date;
    public int size;

    public ImageData(Uri uri, Bitmap thumb, String filename, Date date, int size){
        this.uri = uri;
        this.thumb = thumb;
        this.fileName = filename;
        this.date = date;
        this.size = size;
    }


}
