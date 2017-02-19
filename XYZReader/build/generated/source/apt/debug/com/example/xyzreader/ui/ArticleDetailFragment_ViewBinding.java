// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.xyzreader.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ArticleDetailFragment_ViewBinding<T extends ArticleDetailFragment> implements Unbinder {
  protected T target;

  @UiThread
  public ArticleDetailFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.mPhotoView = Utils.findRequiredViewAsType(source, R.id.photo, "field 'mPhotoView'", ImageView.class);
    target.metaBar = Utils.findRequiredViewAsType(source, R.id.meta_bar, "field 'metaBar'", LinearLayout.class);
    target.mTitleView = Utils.findRequiredViewAsType(source, R.id.article_title, "field 'mTitleView'", TextView.class);
    target.mAuthorView = Utils.findRequiredViewAsType(source, R.id.article_author, "field 'mAuthorView'", TextView.class);
    target.mBodyView = Utils.findRequiredViewAsType(source, R.id.article_body, "field 'mBodyView'", TextView.class);
    target.mShareFab = Utils.findRequiredViewAsType(source, R.id.share_fab, "field 'mShareFab'", FloatingActionButton.class);
    target.mToolbar = Utils.findOptionalViewAsType(source, R.id.detail_toolbar, "field 'mToolbar'", Toolbar.class);
    target.mCollapsingToolbarLayout = Utils.findOptionalViewAsType(source, R.id.toolbar_layout, "field 'mCollapsingToolbarLayout'", CollapsingToolbarLayout.class);
    target.mAppBarLayout = Utils.findOptionalViewAsType(source, R.id.app_bar, "field 'mAppBarLayout'", AppBarLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mPhotoView = null;
    target.metaBar = null;
    target.mTitleView = null;
    target.mAuthorView = null;
    target.mBodyView = null;
    target.mShareFab = null;
    target.mToolbar = null;
    target.mCollapsingToolbarLayout = null;
    target.mAppBarLayout = null;

    this.target = null;
  }
}
