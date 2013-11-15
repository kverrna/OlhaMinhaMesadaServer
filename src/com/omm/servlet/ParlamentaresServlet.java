package com.omm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.omm.controller.ParlamentarController;
import com.omm.helper.JSONHelper;
import com.omm.model.Parlamentar;
	/**
	 * Servlet implementation class RequestHandlerServlet
	 */
	@WebServlet("/parlamentares")
	public class ParlamentaresServlet extends HttpServlet {

		private static final long serialVersionUID = 1L;

		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			
			ParlamentarController controller = new ParlamentarController();
			
			List<Parlamentar> lista = controller.getAllParlamentares();

			String json = JSONHelper.toJSON(lista);
			
			response.getWriter().write(json);

		}
}