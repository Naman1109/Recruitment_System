package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.RecruiterDao;
import dto.Recruiter;

public final class recruiter_005fadd_005fvacancy_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/recruiter_header.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Online Faculty Recruitment</title>\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"jquery.dropotron-1.0.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("\t<div id=\"header-wrapper\">\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"logo\">\n");
      out.write("\t\t\t\t<h1><a href=\"#\">Online Faculty System</a></h1>\n");
      out.write("\t\t\t\t<p>Hire With Us</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #header -->\n");
      out.write("\t<div id=\"menu-wrapper\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li class=\"current_page_item\"><a href=\"recruiter_home.jsp\"><span>Home</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"recruiter_add_vacancy.jsp\"><span>Add Vacancy</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"#\"><span>View Vacancy</span></a></li>\n");
      out.write("\t\t\t<li><a href=\"candidatelist.jsp\"><span>List Of Applied Candidates</span></a></li>\n");
      out.write("                        <li><a href=\"#\"><span>Update Profile</span></a></li>\n");
      out.write("                        <li><a href=\"recruiter_logout.jsp\"><span>Logout</span></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t$('#menu').dropotron();\n");
      out.write("\t\t</script>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page\">\n");
      out.write("\t\t<div id=\"\">\n");
      out.write("\t\t\t<div class=\"contentbg\">\n");
      out.write("\t\t\t\t<div class=\"post\">\n");
      out.write("\t");

            String email = (String)session.getAttribute("email");
        
      out.write("\n");
      out.write("                                    <h2 class=\"title\">Add Vacancy Form</h2>\n");
      out.write("\t\t\t\t\t<div class=\"entry\">\n");
      out.write("\n");
      out.write("   <form action=\"recruiter_add_vacancy_db.jsp\">\n");
      out.write("           <p style=\"font-size:18px;\">Post</p>\n");
      out.write("            <select style=\"font-size:18px;height:30px; width:500px;\" required name=\"post\">\n");
      out.write("             <option value=\"\">Select Post</option>\n");
      out.write("             <option value=\"Assistant Professor\">Assistant Professor</option>\n");
      out.write("             <option value=\"Associate Professor\">Associate Professor</option>\n");
      out.write("             <option value=\"Principal\">Principal</option>\n");
      out.write("             <option value=\"Mathematics Teacher\">Mathematics Teacher</option>\n");
      out.write("             <option value=\"Primary Teacher\">Primary Teacher</option>\n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("     \n");
      out.write("           <p style=\"font-size:18px;\">Subjects</p>\n");
      out.write("            <select required style=\"font-size:18px;height:30px; width:500px;\" name=\"subject\">\n");
      out.write("             <option value=\"\">Select Subject</option>\n");
      out.write("             <option value=\"IT Subjects\">IT Subjects</option>\n");
      out.write("             <option value=\"CS Subjects\">CS Subjects</option>\n");
      out.write("             <option value=\"EC\">EC</option>\n");
      out.write("             <option value=\"Mathematics\">Mathematics</option>\n");
      out.write("             <option value=\"All Subjects\">All Subjects</option>\n");
      out.write("             <option value=\"Others\">Others</option>\n");
      out.write("  \n");
      out.write("            </select>\n");
      out.write("    \n");
      out.write("    <p style=\"font-size:18px;\">Enter Location</p> \n");
      out.write("\n");
      out.write("    <input required style=\"font-size:18px;height:30px; width:500px;\" type=\"text\" name=\"location\" placeholder=\"Enter Location\">\n");
      out.write("         \n");
      out.write("            <p style=\"font-size:18px;\">Criteria</p>\n");
      out.write("            <select required style=\"font-size:18px;height:30px; width:500px;\" name=\"criteria\">\n");
      out.write("             <option value=\"\">Select Qualification</option>\n");
      out.write("             <option value=\"B.com\">B.com</option>\n");
      out.write("             <option value=\"BCA\">BCA</option>\n");
      out.write("             <option value=\"BE\">BE</option>\n");
      out.write("             <option value=\"MCA\">MCA</option>\n");
      out.write("             <option value=\"MBA\">MBA</option>\n");
      out.write("            \n");
      out.write("            </select>\n");
      out.write("     \n");
      out.write("    \n");
      out.write("    <p style=\"font-size:18px;\">Enter Number of Vacancy</p> \n");
      out.write("\n");
      out.write("    <input min=\"0\" required style=\"font-size:18px;height:30px; width:500px;\" type=\"number\" name=\"vacancy\" placeholder=\"Enter No. of Vacancy\">\n");
      out.write(" <p style=\"font-size:18px;\">Enter Salary</p> \n");
      out.write("\n");
      out.write("    <input required style=\"font-size:18px;height:30px; width:500px;\" type=\"text\" name=\"salary\" placeholder=\"Enter Salary\">\n");
      out.write("    <p style=\"font-size:18px;\">Enter Advertising Date</p>\n");
      out.write("    <input required style=\"font-size:18px;height:30px; width:500px;\" type=\"date\" name=\"advdate\">\n");
      out.write("    \n");
      out.write("    <p style=\"font-size:18px;\">Enter Last Date to Apply</p>\n");
      out.write("    <input required style=\"font-size:18px;height:30px; width:500px;\" type=\"date\" name=\"lastdate\">\n");
      out.write("    \n");
      out.write("<p style=\"font-size:18px;\">Recruiter Email</p> \n");
      out.write("\n");
      out.write("<input readonly value=\"");
      out.print(email );
      out.write("\" style=\"font-size:18px;height:30px; width:500px;\" required type=\"email\" name=\"email\"  placeholder=\"Enter Email\">\n");
      out.write("    \n");

RecruiterDao rd = new RecruiterDao();
Recruiter rt = rd.getTypeName(email);

      out.write("\n");
      out.write("\n");
      out.write("<p style=\"font-size:18px;\">Recruiter Type</p> \n");
      out.write("    \n");
      out.write("<input readonly value=\"");
      out.print(rt.getRecruiter() );
      out.write("\" style=\"font-size:18px;height:30px; width:500px;\" required type=\"text\" name=\"recruiter\" placeholder=\"Enter Recruiter Type\">\n");
      out.write("   \n");
      out.write("<p style=\"font-size:18px;\">Recruiter Name</p> \n");
      out.write("<input readonly value=\"");
      out.print(rt.getName() );
      out.write("\" style=\"font-size:18px;height:30px; width:500px;\" required type=\"text\" name=\"recruitername\"  placeholder=\"Enter Recruiter Name\">\n");
      out.write("    \n");
      out.write("            <br>\n");
      out.write("            <input style=\"font-size:18px;height:30px; width:500px;\" type=\"submit\" value=\"Add Vacancy\">\n");
      out.write("           \n");
      out.write("            \n");
      out.write("           </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- end #content -->\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- end #sidebar -->\n");
      out.write("\t\t<div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end #page -->\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("    <p>All Rights Reserved | Designed By Naman Soni&trade; | 2021</p>\n");
      out.write("</div>\n");
      out.write("<!-- end #footer -->\n");
      out.write("</body>\n");
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
