package radaelli.chagas.adami.harian.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import kotlinx.coroutines.CoroutineScope;

/* MainView herdando de android view model */
public class MainViewModel extends AndroidViewModel {

    /* isso possibilita que acessemos o contexto da aplicação dentro do mainView.
    * guardamos a opcao escolhida pelo usuario para q a proxima vez q ele volte
    * o ultimo tipo de lista escolhido seja mostrado*/

    int navigationOpSelected = R.id.gridViewOp;

    LiveData<PagingData<ImageData>> pageLv;

    public MainViewModel(@NonNull Application application){
        super(application);
        GalleryRepository galleryRepository = new GalleryRepository(application);
        GalleryPagingSource galleryPagingSource = new GalleryPagingSource(galleryRepository);
        Pager<Integer,ImageData> pager = new Pager(new PagingConfig(10), () -> galleryPagingSource);
        CoroutineScope viewModelScope = viewModelKt.getViewModelScope(this);
        pageLv = PagingLiveData.cachedIn(PagingLiveData.getLiveData(pager), viewModelScope);
    }

    public LiveData<PagingData<ImageData>> getPageLv(){
        return pageLv;
    }

    public int getNavigationOpSelected(){
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected){
        this.navigationOpSelected = navigationOpSelected;
    }



}
