package views.features.button.code

import views.Code
import com.taig.bootstrapper.Template._
import com.taig.bootstrapper.Template.Button.Size
import com.taig.bootstrapper.Template.Button.Style
import controllers.routes

object BasicExamples extends Code
{
	val code =
		"""
		  |@Button( "Grey and simple", "#", Size.Default, Style.Default, "tag" )
		  |@Button( "Large colors", routes.Application.index(), Size.Large, Style.Danger )
		  |@Button( None, "http://www.google.com", style = Style.Primary, icon = "heart" )
		""".stripMargin

	val preview: Option[String] =
			Button( "Grey and simple", "#", Size.Default, Style.Default, "tag" ) + "\n" +
			Button( "Large colors", routes.Application.index(), Size.Large, Style.Danger ) + "\n" +
			Button( None, "http://www.google.com", style = Style.Primary, icon = "heart" )
}