package dev.tochy.tochyapps.tochyexplorer.directory;

import android.content.Context;
import android.view.ViewGroup;

import dev.tochy.tochyapps.tochyexplorer.R;
import dev.tochy.tochyapps.tochyexplorer.common.RecyclerFragment.RecyclerItemClickListener.OnItemClickListener;
import dev.tochy.tochyapps.tochyexplorer.directory.DocumentsAdapter.Environment;

public class GridDocumentHolder extends ListDocumentHolder {

    public GridDocumentHolder(Context context, ViewGroup parent,
                              OnItemClickListener onItemClickListener, Environment environment) {
        super(context, parent, R.layout.item_doc_grid, onItemClickListener, environment);
    }

}
