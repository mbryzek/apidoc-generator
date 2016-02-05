package golang.models

import lib.Constants

/**
  * @param version e.g. 1.2.3 Used to inject headers on the full version and the major version number
  */
case class ApidocComments(version: String, userAgent: Option[String]) {

  private[this] val elements = Seq(
    Some(s"Generated by apidoc - ${Constants.ApidocUrl}"),
    Some(s"Service version: ${version}"),
    userAgent
  ).flatten

  val comments: String = GoUtil.textToComment(elements)

}
