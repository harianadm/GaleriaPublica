package radaelli.chagas.adami.harian.galeriapublica;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class GalleryRepository {

    Context context;

    public GalleryRepository(Context context){
        this.context = context;
    }

    public List<ImageData> loadImageData(Integer limit, Integer offSet) throws FileNotFoundException{
        List<ImageData> imageDataList = new ArrayList<>();
        int w = (int) context.getResources().getDimension(R.dimen.imWidth);
        int h = (int) context.getResources().getDimension(R.dimen.imHeight);

        String[] projection = new String[]{MediaStore.Images.Media._ID,
            MediaStore.Images.Media.DISPLAY_NAME,
            MediaStore.Images.Media.DATE_ADDED,
            MediaStore.Images.Media.SIZE};
        String selection = null;
        String selectionArgs[] = null;
        String sort = MediaStore.Images.Media.DATE_ADDED;
        Cursor cursor = null;
        if(Build.VERSION.SDK_INT > Build.VERSION_CODES.Q){
            Bundle queryArgs = new Bundle();
            queryArgs.putString(ContentResolver.QUERY_ARG_SQL_SELECTION, selection);
            queryArgs.putStringArray(ContentResolver.QUERY_ARG_SQL_SELECTION_ARGS, selectionArgs);
            //sort
            queryArgs.putString(ContentResolver.QUERY_ARG_SORT_COLUMNS, sort);
            queryArgs.putInt(ContentResolver.QUERY_ARG_SORT_DIRECTION,
                    ContentResolver.QUERY_SORT_DIRECTION_ASCENDING);
            //limit, offset
            queryArgs.putInt(ContentResolver.QUERY_ARG_LIMIT, limit);
            queryArgs.putInt(ContentResolver.QUERY_ARG_OFFSET, offSet);
            cursor = context.getContentResolver().query(MediaStore.Images /*/**//*)
        }
    }


}
