package controllers.frontend

import javax.inject.{ Inject,Singleton }
import play.api.mvc.{AbstractController, ControllerComponents}
import scala.concurrent.ExecutionContext

@Singleton
class FrontendController @Inject() (cc: ControllerComponents) (implicit ec: ExecutionContext) extends AbstractController(cc) {
  def index = Action {
    Ok(views.html.frontend.index())
  }
  def error404 = Action {
    Ok(views.html.frontend.error404())
  }
  def blog = Action {
    Ok(views.html.frontend.blog())
  }
  def blog_single = Action {
    Ok(views.html.frontend.blog_single())
  }
  def cart = Action {
    Ok(views.html.frontend.cart())
  }
  def checkout = Action {
    Ok(views.html.frontend.checkout())
  }
  def contact_us = Action {
    Ok(views.html.frontend.contact_us())
  }
  def login = Action {
    Ok(views.html.frontend.login())
  }
  def product_details = Action {
    Ok(views.html.frontend.product_details())
  }
  def shop = Action {
    Ok(views.html.frontend.shop())
  }
  def home = Action {
    Ok(views.html.frontend.home())
  }
  def echo = Action { request =>
    Ok("Got request:[" + request + "]" )
  }
}