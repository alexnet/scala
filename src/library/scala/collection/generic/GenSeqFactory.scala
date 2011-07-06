/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2011, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */



package scala.collection
package generic

/** A template for companion objects of Seq and subclasses thereof.
 *
 *  @since 2.8
 */
abstract class GenSeqFactory[CC[X] <: GenSeq[X] with GenericTraversableTemplate[X, CC]] extends GenTraversableFactory[CC]