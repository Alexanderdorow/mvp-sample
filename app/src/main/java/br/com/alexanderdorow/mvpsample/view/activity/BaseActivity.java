package br.com.alexanderdorow.mvpsample.view.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import br.com.alexanderdorow.mvpsample.contracts.BaseContracts;

public abstract class BaseActivity<P extends BaseContracts.BasePresenter>
        extends AppCompatActivity
        implements BaseContracts.BaseView {

    protected P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getView());
        presenter = getPresenter();
        onViewReady();
    }

    abstract int getView();

    abstract P getPresenter();

}
