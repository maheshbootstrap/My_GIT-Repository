package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Alerts_005fCheck_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--<script src=\"js/bootstrap.js\"></script>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">   \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"alert alert-info fade in\" id=\"errormsgs\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                Enter Details...!\n");
      out.write("            </div>\n");
      out.write("            <div class=\"alert alert-success fade in\" id=\"errormsgs\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                Enter Details...!\n");
      out.write("            </div>\n");
      out.write("            <div class=\"alert alert-danger fade in\" id=\"errormsgs\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                Enter Details...!\n");
      out.write("            </div>\n");
      out.write("            <div class=\"alert alert-warning fade in text-center\" id=\"errormsgs\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                Enter Details...!\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Button trigger modal -->\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#myModal\">\n");
      out.write("            Launch demo modal\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>\n");
      out.write("                        <h4 class=\"modal-title\" id=\"myModalLabel\">Modal title</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        ...\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">Save changes</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
