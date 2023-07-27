package com.ylly.signature.glide;

import android.content.Context;
import android.net.Uri;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.module.GlideModule;

import java.io.InputStream;

/**
 * @Author : Yo-yo
 * @Description :
 */
public class SignFileModel implements GlideModule {

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {

    }

    @Override
    public void registerComponents(Context context, Glide glide) {
        glide.register(Uri.class, InputStream.class, new SignModelLoader.Factory());
    }

}
