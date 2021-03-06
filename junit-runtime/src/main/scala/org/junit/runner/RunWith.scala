/*
 * Ported from https://github.com/junit-team/junit
 */
package org.junit.runner

import java.lang.annotation._

class RunWith(value: Class[_ <: Runner])
    extends scala.annotation.StaticAnnotation
    with Annotation {

  override def annotationType(): Class[_ <: Annotation] = classOf[RunWith]
}
