package com.example.mediaplayer.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/mediaplayer/di/AppBindsModule;", "", "bindAppResources", "Lcom/example/mediaplayer/res/AppResources;", "appResources", "Lcom/example/mediaplayer/res/AppResourcesImpl;", "bindTrackCatalog", "Lcom/example/mediaplayer/json/TrackCatalog;", "trackCatalog", "Lcom/example/mediaplayer/json/DefaultTrackCatalog;", "app_debug"})
@dagger.Module()
public abstract interface AppBindsModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.mediaplayer.res.AppResources bindAppResources(@org.jetbrains.annotations.NotNull()
    com.example.mediaplayer.res.AppResourcesImpl appResources);
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.example.mediaplayer.json.TrackCatalog bindTrackCatalog(@org.jetbrains.annotations.NotNull()
    com.example.mediaplayer.json.DefaultTrackCatalog trackCatalog);
}