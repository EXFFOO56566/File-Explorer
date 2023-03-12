package dev.tochy.tochyapps.tochyexplorer.directory;

import dev.tochy.tochyapps.tochyexplorer.directory.DocumentsAdapter.Environment;

public class MessageFooter extends Footer {

    public MessageFooter(Environment environment, int itemViewType, int icon, String message) {
        super(itemViewType);
        mIcon = icon;
        mMessage = message;
        mEnv = environment;
    }
}