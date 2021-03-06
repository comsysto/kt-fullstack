package logo

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

@JsModule("logo/react.svg")
external val reactLogo: dynamic

@JsModule("logo/kotlin.svg")
external val kotlinLogo: dynamic

fun RBuilder.logo(height: Int = 100) {
  div("Logo") {
    attrs.style = js {
      this.height = height
    }
    img(alt = "React logo.logo", src = reactLogo, classes = "Logo-react") {}
    img(alt = "Kotlin logo.logo", src = kotlinLogo, classes = "Logo-kotlin") {}
  }
}
