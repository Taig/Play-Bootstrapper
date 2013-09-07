package model

import controllers._
import play.core.PlayVersion

object Version
{
	lazy val play = PlayVersion.current

	lazy val tmpltr = io.Source.fromFile( "../build.sbt" ).getLines().collectFirst(
	{
		case line if line.startsWith( "version" ) => "([\\d\\.]+)".r.findFirstIn( line )
	} ).flatten.getOrElse( "1.0" )

	lazy val bootstrap =
	{
		"([\\d\\.]+)".r
			.findFirstIn( routes.WebJarAssets.at( WebJarAssets.locate( "bootstrap.css" ) ).toString )
			.getOrElse( "[unknown]" )
	}
}