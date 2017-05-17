package ir.jaryaan.matchmatch.ui.home;

import ir.jaryaan.matchmatch.ui.base.BasePresenterContract;
import ir.jaryaan.matchmatch.ui.base.BaseViewContract;

/**
 * Created by ehsun on 5/17/2017.
 */

public interface HomeContract {
    interface View extends BaseViewContract {
        void showGameScreen();

        void showSettingScreen();

        void showScoreScreen();
    }

    interface Presenter extends BasePresenterContract<View> {

    }
}