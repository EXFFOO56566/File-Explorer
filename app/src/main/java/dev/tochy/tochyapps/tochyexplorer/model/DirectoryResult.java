package dev.tochy.tochyapps.tochyexplorer.model;

import android.content.ContentProviderClient;
import android.database.Cursor;

import java.io.Closeable;

import dev.tochy.tochyapps.tochyexplorer.libcore.io.IoUtils;
import dev.tochy.tochyapps.tochyexplorer.misc.ContentProviderClientCompat;

import static dev.tochy.tochyapps.tochyexplorer.BaseActivity.State.MODE_UNKNOWN;
import static dev.tochy.tochyapps.tochyexplorer.BaseActivity.State.SORT_ORDER_UNKNOWN;

public class DirectoryResult implements Closeable {
	public ContentProviderClient client;
    public Cursor cursor;
    public Exception exception;

    public int mode = MODE_UNKNOWN;
    public int sortOrder = SORT_ORDER_UNKNOWN;

    @Override
    public void close() {
        IoUtils.closeQuietly(cursor);
        ContentProviderClientCompat.releaseQuietly(client);
        cursor = null;
        client = null;
    }
}