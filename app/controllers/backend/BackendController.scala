package controllers.backend

import play.api.mvc._
import javax.inject.{ Singleton, Inject}
import scala.concurrent.{ ExecutionContext }

@Singleton
class BackendController @Inject() (cc: ControllerComponents) (implicit ec: ExecutionContext) extends AbstractController(cc) {
  def index = Action {
    Ok(views.html.backend.index())
  }
  def dashboard2 = Action {
    Ok(views.html.backend.index2())
  }
  def widgets = Action {
    Ok(views.html.backend.pages.widgets())
  }
}
