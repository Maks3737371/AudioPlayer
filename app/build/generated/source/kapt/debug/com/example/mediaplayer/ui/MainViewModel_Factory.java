// Generated by Dagger (https://dagger.dev).
package com.example.mediaplayer.ui;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<Application> applicationProvider;

  public MainViewModel_Factory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(applicationProvider.get());
  }

  public static MainViewModel_Factory create(Provider<Application> applicationProvider) {
    return new MainViewModel_Factory(applicationProvider);
  }

  public static MainViewModel newInstance(Application application) {
    return new MainViewModel(application);
  }
}
