package com.example.mediaplayer.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\'H\u0002J\u0012\u0010(\u001a\u00020\'2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\'H\u0016J\b\u0010,\u001a\u00020\'H\u0016J\b\u0010-\u001a\u00020\'H\u0016J\b\u0010.\u001a\u00020\'H\u0016J\b\u0010/\u001a\u00020\'H\u0002J\b\u00100\u001a\u00020\'H\u0002J\b\u00101\u001a\u00020\'H\u0002J\b\u00102\u001a\u00020\'H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u00063"}, d2 = {"Lcom/example/mediaplayer/ui/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "appResources", "Lcom/example/mediaplayer/res/AppResources;", "getAppResources", "()Lcom/example/mediaplayer/res/AppResources;", "setAppResources", "(Lcom/example/mediaplayer/res/AppResources;)V", "currentIndex", "", "exoPlayer", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "isPlaying", "", "trackCatalog", "Lcom/example/mediaplayer/json/TrackCatalog;", "getTrackCatalog", "()Lcom/example/mediaplayer/json/TrackCatalog;", "setTrackCatalog", "(Lcom/example/mediaplayer/json/TrackCatalog;)V", "trackList", "", "Lcom/example/mediaplayer/model/Track;", "viewBinding", "Lcom/example/mediaplayer/databinding/ActivityMainBinding;", "getViewBinding", "()Lcom/example/mediaplayer/databinding/ActivityMainBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/example/mediaplayer/ui/MainViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "initView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "renderButton", "renderData", "setEnableControls", "setListeners", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.google.android.exoplayer2.SimpleExoPlayer exoPlayer;
    private com.example.mediaplayer.ui.MainViewModel viewModel;
    private int currentIndex = 0;
    private boolean isPlaying = true;
    private java.util.List<com.example.mediaplayer.model.Track> trackList;
    @javax.inject.Inject()
    public com.example.mediaplayer.res.AppResources appResources;
    @javax.inject.Inject()
    public com.example.mediaplayer.json.TrackCatalog trackCatalog;
    private final kotlin.Lazy viewBinding$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mediaplayer.res.AppResources getAppResources() {
        return null;
    }
    
    public final void setAppResources(@org.jetbrains.annotations.NotNull()
    com.example.mediaplayer.res.AppResources p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mediaplayer.json.TrackCatalog getTrackCatalog() {
        return null;
    }
    
    public final void setTrackCatalog(@org.jetbrains.annotations.NotNull()
    com.example.mediaplayer.json.TrackCatalog p0) {
    }
    
    private final com.example.mediaplayer.databinding.ActivityMainBinding getViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void initView() {
    }
    
    private final void renderData() {
    }
    
    private final void renderButton() {
    }
    
    private final void setListeners() {
    }
    
    private final void setEnableControls() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
}