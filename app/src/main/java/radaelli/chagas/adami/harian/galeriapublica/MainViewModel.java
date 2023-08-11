package radaelli.chagas.adami.harian.galeriapublica;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;

/* MainView herdando de android view model */
public class MainViewModel extends AndroidViewModel {

    /* isso possibilita que acessemos o contexto da aplicação dentro do mainView.
    * guardamos a opcao escolhida pelo usuario para q a proxima vez q ele volte
    * o ultimo tipo de lista escolhido seja mostrado*/

    int navigationOpSelected = R.id.gridViewOp;

    public MainViewModel(@NonNull Application application){
        super(application);
    }

    public int getNavigationOpSelected(){
        return navigationOpSelected;
    }

    public void setNavigationOpSelected(int navigationOpSelected){
        this.navigationOpSelected = navigationOpSelected;
    }
}
