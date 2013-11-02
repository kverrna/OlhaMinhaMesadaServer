package com.omm.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.omm.controller.CotaParlamentarController;
import com.omm.helper.JSONHelper;
import com.omm.model.CotaParlamentar;

/**
 * Servlet implementation class CotaParlamentarServlet
 */
@WebServlet("/cota")
public class CotaParlamentarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CotaParlamentarServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String idParlamentar = request.getParameter("id");
		

		CotaParlamentarController controller = new CotaParlamentarController();
		

		List<CotaParlamentar> lista = controller.listar(idParlamentar);


		String json = JSONHelper.toJSON(lista);
		

		response.getWriter().write(json);
	}

}
