

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeuNome
 */
@WebServlet("/MeuNome")
public class MeuNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeuNome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Recuperar parametro
		
		String parametro = request.getParameter("q");
		
		// Criar objeto da classe pessoa
		Pessoa eu= new Pessoa(parametro,15 +8);
		
		// Pegar o writer do reponse
		
		PrintWriter out = response.getWriter();
		
		// escrever na variavel out
		out.println("<html><head><title>Meu primeiro servlet</title></head>");
		out.println("<body><h1>Nome: " + eu.getNome() + "</h1>");
		out.println("<h2>Idade: " + eu.getIdade() + "</h2>");
	
		
	    out.println("</body></html>");
		
		
	}

	
	
	
	
	
	
}
