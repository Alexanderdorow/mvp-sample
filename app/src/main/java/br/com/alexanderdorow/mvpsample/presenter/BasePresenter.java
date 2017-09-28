package br.com.alexanderdorow.mvpsample.presenter;

import br.com.alexanderdorow.mvpsample.contracts.BaseContracts;

public abstract class BasePresenter<V extends BaseContracts.BaseView> implements BaseContracts.BasePresenter {

    protected V view;

    BasePresenter(V view) {
        this.view = view;
        onPresenterReady();
    }


}
