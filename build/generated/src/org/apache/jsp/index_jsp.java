package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"selete2/select2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"selete2/select2.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">        \n");
      out.write("        <link rel=\"stylesheet\" href=\"datepicker/datepicker.css\">        \n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"selete2/jquery-1.11.3.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>     \n");
      out.write("        <!--<script src=\"selete2/jquery-1.8.0.min.js\"></script>-->     \n");
      out.write("\n");
      out.write("        <script src=\"selete2/select2.js\"></script>  \n");
      out.write("        <script src=\"selete2/select2.full.js\"></script>  \n");
      out.write("        <script src=\"selete2/select2.min.js\"></script>  \n");
      out.write("        <script src=\"datepicker/bootstrap-datepicker.js\"></script>  \n");
      out.write("        <style>\n");
      out.write("            fieldset{\n");
      out.write("                border:1px solid #cccc;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1> This is my first</h1>\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary\"><span class=\"glyphicon glyphicon-print\"></span> Print</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-trash\"></span> Delete</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-default\"><span class=\"glyphicon glyphicon-refresh\"></span> Refresh</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-success\">Click Me</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-warning\">Click Me</button>\n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"alert alert-success text-center\">\n");
      out.write("                <strong>This is alert..!</strong>My name is buru..\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"alert alert-info fade in\" id=\"errormsgs\">\n");
      out.write("                <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                Enter Details...!\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <select style=\"width: 300px;\" id=\"selecttag\">\n");
      out.write("                <option></option>\n");
      out.write("                <option>Kandy</option>\n");
      out.write("                <option>Colombo</option>\n");
      out.write("                <option>Anuradhapura</option>\n");
      out.write("                <option>Kurunegala</option>\n");
      out.write("                <option>Nuwara Eliya</option>\n");
      out.write("            </select>\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("            <div class=\"input-append date\"  id=\"dp3\" data-date=\"12-02-2012\" data-date-format=\"dd-mm-yyyy\">\n");
      out.write("                <input readonly class=\"span2\" size=\"16\" type=\"text\" >\n");
      out.write("                <span class=\"add-on\"><i class=\"icon-th\"></i></span>\n");
      out.write("            </div>   \n");
      out.write("\n");
      out.write("            <div class=\"control-group\">\n");
      out.write("                <label for=\"date-picker-2\" class=\"control-label\">B</label>\n");
      out.write("                <div class=\"controls\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <input id=\"date-picker-2\" type=\"text\" class=\"date-picker form-control\" />\n");
      out.write("                        <label for=\"date-picker-2\" class=\"input-group-addon btn\"><span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br />\n");
      out.write("            <br />\n");
      out.write("\n");
      out.write("            <div class=\"well well-sm\">\n");
      out.write("                <p>Tax (NBT/VAT)</p>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"form-control\">                \n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" class=\"form-control\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("//\n");
      out.write("            $('#dp3').datepicker('show');\n");
      out.write("            $(\"#date-picker-2\").datepicker();\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#selecttag').append('<i class=\"fa fa-angle-down\"></i>');\n");
      out.write("                $(\"#selecttag\").select2({\n");
      out.write("                    placeholder: \"Select a Town\",\n");
      out.write("                    allowClear: true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
