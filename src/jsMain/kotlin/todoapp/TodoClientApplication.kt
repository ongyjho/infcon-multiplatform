package todoapp

import kotlinx.browser.document
import kotlinx.html.div
import kotlinx.html.dom.create
import kotlinx.html.h1

/**
 * 클라이언트 애플리케이션 진입점(entry point)
 *
 * @author springrunner.kr@gmail.com
 */
fun main() {
    val container = document.getElementById("root") ?: error("Couldn't find root container!")

    container.appendChild(
        document.create.div {
            h1 {
                +"TODO App"
            }
        }
    )
}
