package br.com.alexanderdorow.mvpsample.contracts;

public interface BaseContracts {

    interface BaseView{
        void onViewReady();
    }

    interface BasePresenter{
        void onPresenterReady();
    }

}
