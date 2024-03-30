package com.brandonang.boldhtml;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.AndroidViewComponent;
import android.view.View;
import android.webkit.WebView;

public class BoldHTML extends AndroidNonvisibleComponent {

  public BoldHTML(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public void BoldTextInHTML(AndroidViewComponent webViewer, String text) {
    View view = webViewer.getView();
    WebView webView = (WebView) view;
    String boldText = "<b>" + text + "</b>";
    String mimeType = "text/html";
    String encoding = "UTF-8";
    webView.loadDataWithBaseURL("", boldText, mimeType, encoding, "");
  }
}
