package views.features.button

import views.Code
import com.taig.bootstrapper.bootstrap.Template
import Template._
import controllers.routes
import com.taig.bootstrapper.bootstrap.Template

object CommonUseCases extends Code
{
	val code: String =
		"""
		  |@Button.Add( "User", routes.Application.index() )
		  |...
		  |@Button.Save( "#" )
		""".stripMargin

	val preview: Option[String] =
			Button.Add( "User", routes.Application.index() ) + "\n" +
			Button.Cancel( "#" ) + "\n" +
			Button.Delete( routes.Application.index() ) + "\n" +
			Button.Edit( routes.Application.index() ) + "\n" +
			Button.Save( "#" )
}