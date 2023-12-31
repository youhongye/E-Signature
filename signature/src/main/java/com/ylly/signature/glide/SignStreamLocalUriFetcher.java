package com.ylly.signature.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

import com.bumptech.glide.load.data.StreamLocalUriFetcher;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : Yo-yo
 * @Description :
 */
public class SignStreamLocalUriFetcher extends StreamLocalUriFetcher {

    public SignStreamLocalUriFetcher(Context context, Uri uri) {
        super(context, uri);
    }

    @Override
    protected InputStream loadResource(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        if (ContentResolver.SCHEME_FILE.equals(uri.getScheme()) && uri.getPath().endsWith(".sign")) {
            try {
                return new SignFileInputStream(uri.getPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return super.loadResource(uri, contentResolver);
    }

}
