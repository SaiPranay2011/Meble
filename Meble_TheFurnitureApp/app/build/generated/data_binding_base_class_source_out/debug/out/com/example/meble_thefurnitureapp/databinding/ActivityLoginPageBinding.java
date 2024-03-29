// Generated by data binding compiler. Do not edit!
package com.example.meble_thefurnitureapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.meble_thefurnitureapp.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityLoginPageBinding extends ViewDataBinding {
  @NonNull
  public final View divider;

  @NonNull
  public final EditText email;

  @NonNull
  public final EditText pass;

  protected ActivityLoginPageBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View divider, EditText email, EditText pass) {
    super(_bindingComponent, _root, _localFieldCount);
    this.divider = divider;
    this.email = email;
    this.pass = pass;
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login_page, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginPageBinding>inflateInternal(inflater, R.layout.activity_login_page, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_login_page, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityLoginPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityLoginPageBinding>inflateInternal(inflater, R.layout.activity_login_page, null, false, component);
  }

  public static ActivityLoginPageBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityLoginPageBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityLoginPageBinding)bind(component, view, R.layout.activity_login_page);
  }
}
