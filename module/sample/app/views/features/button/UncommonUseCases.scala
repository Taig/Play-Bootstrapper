package views.features.button

import views.Code
import com.taig.bootstrapper.bootstrap.Template
import Template._
import com.taig.bootstrapper.bootstrap.Template
import Template.Button.Size
import controllers.routes

object UncommonUseCases extends Code
{
	val code: String =
		"""
		  |@Button.Cancel( routes.Application.index(), size = Size.Mini )
		  |@Button.Edit( routes.Application.index(), compact = true )
		""".stripMargin

	val preview: Option[String] =
			Button.Cancel( routes.Application.index(), size = Size.Mini ) + "\n" +
			Button.Edit( routes.Application.index(), compact = true )
}