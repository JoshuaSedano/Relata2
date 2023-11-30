// Generated by view binder compiler. Do not edit!
package com.joshua.joshuarelata2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.joshua.joshuarelata2.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCrearRelatoPjsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnAddAutor;

  @NonNull
  public final ImageView btnBAck;

  @NonNull
  public final Button btnContinuarTrama;

  @NonNull
  public final Button btnGuardarAutor;

  @NonNull
  public final ImageView btnMenu;

  @NonNull
  public final TextView editTextText6;

  @NonNull
  public final TextView editTextText8;

  @NonNull
  public final TextView etCabecera;

  @NonNull
  public final ImageView imageView8;

  @NonNull
  public final EditText iniciarRelatoText7;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final Toolbar toolbar2;

  @NonNull
  public final TextView txtBuscador;

  @NonNull
  public final EditText txtComentario;

  private ActivityCrearRelatoPjsBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnAddAutor, @NonNull ImageView btnBAck, @NonNull Button btnContinuarTrama,
      @NonNull Button btnGuardarAutor, @NonNull ImageView btnMenu, @NonNull TextView editTextText6,
      @NonNull TextView editTextText8, @NonNull TextView etCabecera, @NonNull ImageView imageView8,
      @NonNull EditText iniciarRelatoText7, @NonNull ImageView logo, @NonNull Toolbar toolbar,
      @NonNull Toolbar toolbar2, @NonNull TextView txtBuscador, @NonNull EditText txtComentario) {
    this.rootView = rootView;
    this.btnAddAutor = btnAddAutor;
    this.btnBAck = btnBAck;
    this.btnContinuarTrama = btnContinuarTrama;
    this.btnGuardarAutor = btnGuardarAutor;
    this.btnMenu = btnMenu;
    this.editTextText6 = editTextText6;
    this.editTextText8 = editTextText8;
    this.etCabecera = etCabecera;
    this.imageView8 = imageView8;
    this.iniciarRelatoText7 = iniciarRelatoText7;
    this.logo = logo;
    this.toolbar = toolbar;
    this.toolbar2 = toolbar2;
    this.txtBuscador = txtBuscador;
    this.txtComentario = txtComentario;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCrearRelatoPjsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCrearRelatoPjsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_crear_relato_pjs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCrearRelatoPjsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_add_autor;
      Button btnAddAutor = ViewBindings.findChildViewById(rootView, id);
      if (btnAddAutor == null) {
        break missingId;
      }

      id = R.id.btnBAck;
      ImageView btnBAck = ViewBindings.findChildViewById(rootView, id);
      if (btnBAck == null) {
        break missingId;
      }

      id = R.id.btnContinuarTrama;
      Button btnContinuarTrama = ViewBindings.findChildViewById(rootView, id);
      if (btnContinuarTrama == null) {
        break missingId;
      }

      id = R.id.btn_guardar_autor;
      Button btnGuardarAutor = ViewBindings.findChildViewById(rootView, id);
      if (btnGuardarAutor == null) {
        break missingId;
      }

      id = R.id.btnMenu;
      ImageView btnMenu = ViewBindings.findChildViewById(rootView, id);
      if (btnMenu == null) {
        break missingId;
      }

      id = R.id.editTextText6;
      TextView editTextText6 = ViewBindings.findChildViewById(rootView, id);
      if (editTextText6 == null) {
        break missingId;
      }

      id = R.id.editTextText8;
      TextView editTextText8 = ViewBindings.findChildViewById(rootView, id);
      if (editTextText8 == null) {
        break missingId;
      }

      id = R.id.etCabecera;
      TextView etCabecera = ViewBindings.findChildViewById(rootView, id);
      if (etCabecera == null) {
        break missingId;
      }

      id = R.id.imageView8;
      ImageView imageView8 = ViewBindings.findChildViewById(rootView, id);
      if (imageView8 == null) {
        break missingId;
      }

      id = R.id.iniciarRelatoText7;
      EditText iniciarRelatoText7 = ViewBindings.findChildViewById(rootView, id);
      if (iniciarRelatoText7 == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.toolbar2;
      Toolbar toolbar2 = ViewBindings.findChildViewById(rootView, id);
      if (toolbar2 == null) {
        break missingId;
      }

      id = R.id.txtBuscador;
      TextView txtBuscador = ViewBindings.findChildViewById(rootView, id);
      if (txtBuscador == null) {
        break missingId;
      }

      id = R.id.txtComentario;
      EditText txtComentario = ViewBindings.findChildViewById(rootView, id);
      if (txtComentario == null) {
        break missingId;
      }

      return new ActivityCrearRelatoPjsBinding((ConstraintLayout) rootView, btnAddAutor, btnBAck,
          btnContinuarTrama, btnGuardarAutor, btnMenu, editTextText6, editTextText8, etCabecera,
          imageView8, iniciarRelatoText7, logo, toolbar, toolbar2, txtBuscador, txtComentario);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}