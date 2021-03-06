// Generated by Dagger (https://dagger.dev).
package com.example.mediaplayer.di;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.lifecycle.ViewModel;
import com.example.mediaplayer.json.DefaultTrackCatalog;
import com.example.mediaplayer.json.DefaultTrackCatalog_Factory;
import com.example.mediaplayer.res.AppResourcesImpl;
import com.example.mediaplayer.ui.MainActivity;
import com.example.mediaplayer.ui.MainActivity_MembersInjector;
import com.example.mediaplayer.ui.MainViewModel;
import com.example.mediaplayer.ui.MainViewModel_Factory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory;
import dagger.internal.Preconditions;
import java.util.Map;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private final AppModule appModule;

  private final Application application;

  private final DaggerAppComponent appComponent = this;

  private Provider<Application> applicationProvider;

  private Provider<MainViewModel> mainViewModelProvider;

  private Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> mapOfClassOfAndProviderOfViewModelProvider;

  private Provider<AppViewModelFactory> appViewModelFactoryProvider;

  private Provider<AssetManager> provideAssetManagerProvider;

  private Provider<DefaultTrackCatalog> defaultTrackCatalogProvider;

  private DaggerAppComponent(AppModule appModuleParam, Application applicationParam) {
    this.appModule = appModuleParam;
    this.application = applicationParam;
    initialize(appModuleParam, applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Context context() {
    return AppModule_ProvideAppContextFactory.provideAppContext(appModule, application);
  }

  private AppResourcesImpl appResourcesImpl() {
    return new AppResourcesImpl(context());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final AppModule appModuleParam, final Application applicationParam) {
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.mainViewModelProvider = MainViewModel_Factory.create(applicationProvider);
    this.mapOfClassOfAndProviderOfViewModelProvider = MapProviderFactory.<Class<? extends ViewModel>, ViewModel>builder(1).put(MainViewModel.class, (Provider) mainViewModelProvider).build();
    this.appViewModelFactoryProvider = DoubleCheck.provider(AppViewModelFactory_Factory.create(mapOfClassOfAndProviderOfViewModelProvider));
    this.provideAssetManagerProvider = AppModule_ProvideAssetManagerFactory.create(appModuleParam, applicationProvider);
    this.defaultTrackCatalogProvider = DoubleCheck.provider(DefaultTrackCatalog_Factory.create(provideAssetManagerProvider));
  }

  @Override
  public void inject(MainActivity mainActivity) {
    injectMainActivity(mainActivity);
  }

  private MainActivity injectMainActivity(MainActivity instance) {
    MainActivity_MembersInjector.injectViewModelFactory(instance, appViewModelFactoryProvider.get());
    MainActivity_MembersInjector.injectAppResources(instance, appResourcesImpl());
    MainActivity_MembersInjector.injectTrackCatalog(instance, defaultTrackCatalogProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(new AppModule(), application);
    }
  }
}
