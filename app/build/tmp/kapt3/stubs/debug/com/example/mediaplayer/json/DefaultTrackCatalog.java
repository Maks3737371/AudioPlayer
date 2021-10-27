package com.example.mediaplayer.json;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mediaplayer/json/DefaultTrackCatalog;", "Lcom/example/mediaplayer/json/TrackCatalog;", "assetManager", "Landroid/content/res/AssetManager;", "(Landroid/content/res/AssetManager;)V", "_catalog", "", "Lcom/example/mediaplayer/model/Track;", "catalog", "getCatalog", "()Ljava/util/List;", "getTrackCatalog", "initCatalogFromJson", "", "app_debug"})
@javax.inject.Singleton()
public final class DefaultTrackCatalog implements com.example.mediaplayer.json.TrackCatalog {
    private final android.content.res.AssetManager assetManager = null;
    private java.util.List<com.example.mediaplayer.model.Track> _catalog;
    
    @javax.inject.Inject()
    public DefaultTrackCatalog(@org.jetbrains.annotations.NotNull()
    android.content.res.AssetManager assetManager) {
        super();
    }
    
    private final java.util.List<com.example.mediaplayer.model.Track> getCatalog() {
        return null;
    }
    
    private final void initCatalogFromJson() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.mediaplayer.model.Track> getTrackCatalog() {
        return null;
    }
}