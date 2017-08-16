package controllers.backend

import play.api.mvc._
import javax.inject.{ Singleton, Inject}
import scala.concurrent.{ ExecutionContext }

@Singleton
class BackendController @Inject() (cc: ControllerComponents) (implicit ec: ExecutionContext) extends AbstractController(cc) {
  def index = Action {
    Ok("OK")
  }
}
