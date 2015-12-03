package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Tables_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"selete2/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>  \n");
      out.write("        <script src=\"boottables/bootstrap-table.js\"></script>  \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"boottables/bootstrap-table.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <table id=\"getdatatable\"\n");
      out.write("                   data-toggle=\"table\"\n");
      out.write("                   data-height=\"460\"\n");
      out.write("                   data-pagination=\"true\"\n");
      out.write("                   data-search=\"true\"\n");
      out.write("                   data-url=\"GetData\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th data-halign=\"center\" data-field=\"id\">ID</th>\n");
      out.write("                        <th data-field=\"name\">Name</th>\n");
      out.write("                        <th data-field=\"age\">Age</th>\n");
      out.write("                        <th data-field=\"town\">Town</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var $table = $('#getdatatable');\n");
      out.write("            $(function() {\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
