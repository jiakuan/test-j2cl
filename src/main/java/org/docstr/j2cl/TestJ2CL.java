package org.docstr.j2cl;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import jsinterop.annotations.JsType;
import org.treblereel.j2cl.processors.annotations.GWT3EntryPoint;

@JsType
public class TestJ2CL {

  public static final String HELLO_WORLD = "Hello J2CL world!";

  @GWT3EntryPoint
  public void onModuleLoad() {
    HTMLDivElement wrapper = (HTMLDivElement) DomGlobal.document.createElement(
        "div");
    wrapper.classList.add("wrapper");

    HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement(
        "button");
    btn.classList.add("myButton");
    btn.textContent = "J2CL !!!";

    btn.addEventListener("click", evt -> btn.textContent = helloWorldString());

    wrapper.appendChild(btn);

    DomGlobal.document.body.appendChild(wrapper);
  }

  public String helloWorldString() {
    return HELLO_WORLD;
  }
}
