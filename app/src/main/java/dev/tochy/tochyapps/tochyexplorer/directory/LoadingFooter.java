package dev.tochy.tochyapps.tochyexplorer.directory;

import dev.tochy.tochyapps.tochyexplorer.directory.DocumentsAdapter.Environment;

public class LoadingFooter extends Footer {

    public LoadingFooter(Environment environment, int type) {
        super(type);
        mEnv = environment;
        mIcon = 0;
        mMessage = "";
    }
}