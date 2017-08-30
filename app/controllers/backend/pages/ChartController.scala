package controllers.backend.pages

import javax.inject.{ Inject, Singleton}
import play.api.mvc.{AbstractController, ControllerComponents}
import scala.concurrent.ExecutionContext

@Singleton
class ChartController @Inject() (cc: ControllerComponents) (implicit ec: ExecutionContext) extends AbstractController(cc) {
  def chartjs = Action {
    Ok(views.html.backend.pages.charts.chartjs())
  }
  def flot = Action {
    Ok(views.html.backend.pages.charts.flot())
  }
  def inline = Action {
    Ok(views.html.backend.pages.charts.inline())
  }
  def morris = Action {
    Ok(views.html.backend.pages.charts.morris())
  }
}
