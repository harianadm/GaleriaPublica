package radaelli.chagas.adami.harian.galeriapublica;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class ImageDataComparator extends DiffUtil.ItemCallback<ImageData> {
    @Override
    public boolean areItemsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem){
        //Id unico
        return oldItem.uri.equals(newItem.uri);
    }
    @Override
    public boolean areContentsTheSame(@NonNull ImageData oldItem, @NonNull ImageData newItem){
        return oldItem.uri.equals(newItem.uri);
    }
}
