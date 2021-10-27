package com.example.mediaplayer.res;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0003H&J\u001a\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\'J\u0012\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u0003H&J/\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\u00032\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0012\"\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH&J\u001a\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u0003H&J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH&J\u001a\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0003\u0010\u0018\u001a\u00020\u0003H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/example/mediaplayer/res/AppResources;", "", "getColor", "", "colorId", "getDimension", "", "resId", "getInteger", "getPlurals", "", "pluralsId", "quantity", "getRawResIdByName", "resourceName", "getString", "stringId", "formatArgs", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getStringByName", "defaultStringRes", "defaultString", "getStringResIdByName", "defaultValue", "app_debug"})
public abstract interface AppResources {
    
    public abstract int getColor(@androidx.annotation.ColorRes()
    int colorId);
    
    public abstract float getDimension(@androidx.annotation.DimenRes()
    int resId);
    
    public abstract int getInteger(@androidx.annotation.IntegerRes()
    int resId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getString(@androidx.annotation.StringRes()
    int stringId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getString(@androidx.annotation.StringRes()
    int stringId, @org.jetbrains.annotations.NotNull()
    java.lang.Object... formatArgs);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getPlurals(@androidx.annotation.PluralsRes()
    int pluralsId, int quantity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStringByName(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStringByName(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName, @androidx.annotation.StringRes()
    int defaultStringRes);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStringByName(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultString);
    
    @androidx.annotation.StringRes()
    public abstract int getStringResIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName, @androidx.annotation.StringRes()
    int defaultValue);
    
    @androidx.annotation.RawRes()
    public abstract int getRawResIdByName(@org.jetbrains.annotations.NotNull()
    java.lang.String resourceName);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}