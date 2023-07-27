package com.ylly.signature.glide;

import android.content.Context;
import android.net.Uri;

import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GenericLoaderFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.stream.StreamUriLoader;

import java.io.InputStream;

/**
 * @Author : Yo-yo
 * @Description :
 */
public class SignModelLoader extends StreamUriLoader {

    public SignModelLoader(Context context) {
        super(context);
    }

    public SignModelLoader(Context context, ModelLoader<GlideUrl, InputStream> urlLoader) {
        super(context, urlLoader);
    }

    @Override
    protected DataFetcher<InputStream> getLocalUriFetcher(Context context, Uri uri) {
        return new SignStreamLocalUriFetcher(context, uri);
    }

    public static class Factory implements ModelLoaderFactory<Uri, InputStream> {

        @Override
        public ModelLoader<Uri, InputStream> build(Context context, GenericLoaderFactory factories) {
            return new SignModelLoader(context, factories.buildModelLoader(GlideUrl.class, InputStream.class));
        }

        @Override
        public void teardown() {

        }
    }
}
