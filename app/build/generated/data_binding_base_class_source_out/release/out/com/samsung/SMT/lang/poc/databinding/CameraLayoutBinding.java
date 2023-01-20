// Generated by view binder compiler. Do not edit!
package com.samsung.SMT.lang.poc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.samsung.SMT.lang.poc.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CameraLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final FrameLayout surfaceLayout;

  private CameraLayoutBinding(@NonNull LinearLayout rootView, @NonNull FrameLayout surfaceLayout) {
    this.rootView = rootView;
    this.surfaceLayout = surfaceLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CameraLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CameraLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.camera_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CameraLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.surfaceLayout;
      FrameLayout surfaceLayout = rootView.findViewById(id);
      if (surfaceLayout == null) {
        break missingId;
      }

      return new CameraLayoutBinding((LinearLayout) rootView, surfaceLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}