/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-08 14:43:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ilp.ims.Bean.*;
import java.util.ArrayList;

public final class viewCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1707224682000L));
    _jspx_dependants.put("/navigation.jsp", Long.valueOf(1707224682000L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1707224682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("com.ilp.ims.Bean");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");

response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");//HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader ("Expires", 0);

      out.write('\n');

if(request.getSession(false).getAttribute("type")==null)
{

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("Login.jsp");
        return;
      }
      out.write('\n');
} 
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>View Customers</title>\n");
      out.write("<script type=\"text/javascript\" src=\"js/validateCustomer.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER") || request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer"))
 { 
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Header</title>\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"site-header\">\n");
      out.write("	\n");
      out.write("			<div class=\"imgdiv\">\n");
      out.write("			<img alt=\"Logo\" src=\"images/InLogo.png\">\n");
      out.write("			</div>\n");
      out.write("		 \n");
      out.write("			<div class=\"logout\">\n");
      out.write("			");
if(request.getSession(false).getAttribute("type")!=null){ 
      out.write("\n");
      out.write("			<form method=\"post\" action=\"LogInController\">\n");
      out.write("			<button type=\"submit\" class=\"exit-btn exit-btn-1\">LogOut</button>\n");
      out.write("			<input name=\"action\" type=\"hidden\" value=\"logout\"/>\n");
      out.write("			</form>\n");
      out.write("			");
} 
      out.write("\n");
      out.write("			</div>\n");
      out.write("	\n");
      out.write("	\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Navigation</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<nav id=\"nav\">\n");
      out.write("  <ul class=\"clearfix\">\n");
      out.write("		<li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("		<li><a href=\"about.jsp\">About Us</a></li>\n");
      out.write("		<li><a href=\"InsuranceController?test=-1\">Policy Details</a></li>\n");
      out.write("		\n");
      out.write("		<li><a href=\"\" aria-haspopup=\"true\"><span>Customer</span></a>\n");
      out.write("		");
 if(request.getSession(false).getAttribute("type")!=null)
		if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER") || request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer"))
 { 
      out.write("\n");
      out.write("			<ul>\n");
      out.write("				<li><a href=\"addCustomer.jsp\">Register Customer</a></li>\n");
      out.write("				<li><a href=\"updateCustomer.jsp\">Update Customer</a></li>\n");
      out.write("				<li><a href=\"viewCustomer.jsp\">View Customer</a></li>\n");
      out.write("				<li><a href=\"removeCustomer.jsp\">Remove Customer</a></li>\n");
      out.write("			</ul>");
} 
      out.write("\n");
      out.write("		</li>\n");
      out.write("		<li>\n");
      out.write("			<a href=\"\" aria-haspopup=\"true\"><span>Policy</span></a>\n");
      out.write("			");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER") || request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer"))
 { 
      out.write("\n");
      out.write("			<ul>\n");
      out.write("			");
if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer")){ 
      out.write("\n");
      out.write("				<li><a href=\"addHealthPolicy.jsp\" >Add health Policy</a></li>");
} 
      out.write("\n");
      out.write("				");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER")) {
      out.write("\n");
      out.write("				<li><a href=\"addVehiclePolicy.jsp\" >Add vehicle Policy</a></li>");
} 
      out.write("\n");
      out.write("				<li><a href=\"updatePolicy.jsp\">Update Policy</a></li>\n");
      out.write("				<li><a href=\"viewPolicy.jsp\">View Policy</a></li>\n");
      out.write("				<li><a href=\"terminatePolicy.jsp\">Terminate Policy</a></li>\n");
      out.write("			</ul>");
 } 
      out.write("\n");
      out.write("		</li>\n");
      out.write("		<li>\n");
      out.write("			<a href=\"\" aria-haspopup=\"true\"><span>Claim</span></a>\n");
      out.write("			<ul>\n");
      out.write("			");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER") || request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer"))
 			{ 
      out.write("\n");
      out.write("				<li><a href=\"applyClaim.jsp\">Apply Claim</a></li>\n");
      out.write("				<li><a href=\"updateClaim.jsp\">Update Claim</a></li>\n");
      out.write("				");
} 
      out.write("\n");
      out.write("				");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("ADMIN")){
      out.write("\n");
      out.write("				<li><a href=\"approveClaim.jsp\">Approve/Reject Claim</a></li>\n");
      out.write("				<li><a href=\"ViewClaim.jsp\">View Claim</a></li>");
}
      out.write("\n");
      out.write("				");
 if(request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("FIELD OFFICER") || request.getSession(false).getAttribute("type").toString().equalsIgnoreCase("Insurance officer"))
 				{ 
      out.write("\n");
      out.write("				<li><a href=\"cancleClaim.jsp\">Remove Claim</a></li>\n");
      out.write("				");
} 
      out.write("\n");
      out.write("			</ul>\n");
      out.write("		</li>\n");
      out.write("	\n");
      out.write("  </ul>\n");
      out.write("</nav>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("<br>\n");

	ArrayList<Customer> custList = (ArrayList<Customer>) request.getAttribute("custList");	
	if(custList==null){
	
      out.write("\n");
      out.write("<form action=\"CustomerController\" method=\"post\" name=\"viewform\" class=\"basic-grey\" onsubmit=\"return dateMandatory()\">\n");
      out.write("    <h1> \n");
      out.write("        View Customers\n");
      out.write("    </h1>\n");
      out.write("    <label>\n");
      out.write("        <span>Start Date :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"date\" name=\"sdate\" onblur=\"startdate(this.value)\"/>\n");
      out.write("        <p id=\"sdate_msg\">");
 if(request.getAttribute("sdate")!=null && request.getAttribute("sdate").toString().equals("sdate")){out.print("Start Date must not be empty."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>End Date :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"date\" name=\"edate\" onblur=\"enddate(this.value)\"/>\n");
      out.write("        <p id=\"edate_msg\">");
 if(request.getAttribute("edate")!=null && request.getAttribute("edate").toString().equals("edate")){out.print("End Date must not be empty."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("     \n");
      out.write("     <center>\n");
      out.write("        <span>&nbsp;</span> \n");
      out.write("        <input type=\"submit\"  value=\"View\" /><input type=\"reset\"  value=\"reset\" />  \n");
      out.write("        </center>\n");
      out.write("     <br>\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"viewCustomer\">\n");
      out.write("    \n");
      out.write("</form>\n");
      out.write("<br>\n");
} 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("	");
 if(custList!=null){		
		
      out.write("\n");
      out.write("		\n");
      out.write("		<table border=\"1\" align=\"center\" >\n");
      out.write("			<tr>\n");
      out.write("				<th>Customer ID</th>\n");
      out.write("				<th>Customer Name</th>\n");
      out.write("				<th>DOB</th>\n");
      out.write("				<th>Email</th>\n");
      out.write("				<th>Address</th>\n");
      out.write("				<th>Contact No.</th>\n");
      out.write("				<th>Photo Id Proof</th>\n");
      out.write("				<th>Photo Id No.</th>\n");
      out.write("				<th>Address Proof</th>\n");
      out.write("				<th>Registration Date</th>\n");
      out.write("			</tr>\n");
      out.write("		");

		int i=1;
		for( Customer customer : custList) {
		
      out.write("\n");
      out.write("		\n");
      out.write("			<tr>\n");
      out.write("				<td>");
      out.print( customer.getCustomerId());
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getCustomerName() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getDob() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getEmail() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getAddress() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getContactNo() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getPhotoIdProof() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getPhotoIdNo() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getAddressProof() );
      out.write("</td>\n");
      out.write("				<td>");
      out.print( customer.getRegistrationDate() );
      out.write("</td>\n");
      out.write("			</tr>\n");
      out.write("		");

			}
		
      out.write("\n");
      out.write("		\n");
      out.write("		</table>\n");
      out.write("		  	<!-- FOR OK AND BACK BUTTON  -->\n");
      out.write("		<table align=\"center\">\n");
      out.write("		<tr>\n");
      out.write("		<td >\n");
      out.write("		<form action =\"home.jsp\" class=\"button_style\">\n");
      out.write("		<input type=\"submit\" value=\"Ok\"/> \n");
      out.write("		</form>\n");
      out.write("		</td>\n");
      out.write("		<td>\n");
      out.write("		<form action=\"viewCustomer.jsp\" class=\"button_style\">\n");
      out.write("		<input type=\"submit\" value=\"Back\">\n");
      out.write("		</form>\n");
      out.write("		</td>\n");
      out.write("		</tr>\n");
      out.write("		</table><br>\n");
      out.write("		\n");
      out.write("	");

	}
	
      out.write('\n');
      out.write('	');
      out.write('\n');
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div class=\"footer\">\n");
      out.write("<p>Copyright &copy; 2014 by India Assurance Co. Ltd.</p>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
}else{
      out.write("\n");
      out.write("<script>if(window.confirm('You are not officer')) \n");
      out.write("					  		{window.location = 'home.jsp';}\n");
      out.write("					  		else{window.location = 'home.jsp';}\n");
      out.write("					  		</script>\n");
      out.write("<noscript>You are not officer</noscript>\n");
 }
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
