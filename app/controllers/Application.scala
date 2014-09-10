package controllers

import play.api._
import play.api.mvc._
import views.html.pages.index

object Application extends Controller {

  def indexPage = Action {
    println("hello")
    Ok(index("Your new application is ready."))
  }

}