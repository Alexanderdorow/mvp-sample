package br.com.alexanderdorow.mvpsample.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.alexanderdorow.mvpsample.contracts.BaseContracts;

public abstract class BaseFragment<P extends BaseContracts.BasePresenter> extends Fragment implements BaseContracts.BaseView {

    protected P presenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getViewId(), null, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.presenter = getPresenter();
        onViewReady();
    }

    abstract int getViewId();

    abstract P getPresenter();

}
