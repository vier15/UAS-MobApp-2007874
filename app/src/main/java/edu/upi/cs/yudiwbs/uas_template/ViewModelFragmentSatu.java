package edu.upi.cs.yudiwbs.uas_template;

import android.os.Parcelable;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewModelFragmentSatu extends ViewModel {
    //public MutableLiveData<String> data;
    public MutableLiveData<Parcelable> recViewState;

    public ViewModelFragmentSatu() {
        recViewState = new MutableLiveData<Parcelable>();
        recViewState.setValue(null);
    }

    public MutableLiveData<Parcelable> getRecViewState() {
        return recViewState;
    }

    public void setRecViewState (Parcelable state) {
        recViewState.setValue(state);
    }

}
