/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-08 14:49:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("    \n");
      out.write("    ");

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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Register Customer</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("<link rel=\"icon\" href=\"images/favicon.ico\" type=\"image/x-icon\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/validateCustomer.js\"></script>\n");
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
      out.write("<form action=\"CustomerController\" method=\"post\" name=\"customerform\" class=\"basic-grey\" onsubmit=\"return registrationMandatory()\">\n");
      out.write("    <h1> \n");
      out.write("        Register Customer\n");
      out.write("    </h1>\n");
      out.write("    <label>\n");
      out.write("        <span>Name :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"text\" name=\"cname\" onblur=\"customername(this.value)\" placeholder=\"First name only\" maxlength=\"15\"/>\n");
      out.write("        <p id=\"cname_msg\" >");
if(request.getAttribute("customerName")!=null && request.getAttribute("customerName").toString().equals("customerName")){out.print("Customer name must be valid or filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("     <label>\n");
      out.write("        <span>Date of Birth :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"date\" name=\"cdob\" id=\"cdate\" onblur=\"customerdob(this.value)\"/>\n");
      out.write("        <p id=\"cdob_msg\">");
if(request.getAttribute("DOB")!=null && request.getAttribute("DOB").toString().equals("DOB")){out.print("Date Of Birth must be filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>Email-ID :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"text\" name=\"cemail\" id=\"cemail\" onblur=\"customeremail(this.value)\"/>\n");
      out.write("        <p id=\"cemail_msg\">");
if(request.getAttribute("customerEmail")!=null && request.getAttribute("customerEmail").toString().equals("customerEmail")){out.print("Email must be filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>Address :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <textarea name=\"caddress\" onblur=\"customeraddress(this.value)\" maxlength=\"150\"></textarea>\n");
      out.write("        <p id=\"caddress_msg\">");
if(request.getAttribute("address")!=null && request.getAttribute("address").toString().equals("address")){out.print("Address must be filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("     <label>\n");
      out.write("        <span>Contact No. :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"text\" name=\"ccontact\" id=\"ccontact\" onblur=\"customercontact(this.value)\" maxlength=\"10\"/>\n");
      out.write("        <p id=\"ccontact_msg\">");
if(request.getAttribute("cNo")!=null && request.getAttribute("cNo").toString().equals("cNo")){out.print("Contact number must be filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>Photo ID Proof :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <select name=\"cphotoproof\" onblur=\"customerphotoproof(this.value)\">\n");
      out.write("        <option value=\"default\" selected>--Select--</option>\n");
      out.write("        <option value=\"pancard\">PAN Card</option>\n");
      out.write("        <option value=\"passport\">Passport</option>\n");
      out.write("        <option value=\"voterid\">Voter ID Card</option>\n");
      out.write("        <option value=\"drivinglicence\">Driving License</option>\n");
      out.write("        <option value=\"employeeid\">Employee ID Card</option>\n");
      out.write("        <option value=\"bankpassbook\">Bank Passbook</option>\n");
      out.write("        </select><p id=\"cphotoproof_msg\">");
if(request.getAttribute("photoIdProof")!=null  && request.getAttribute("photoIdProof").toString().equals("photoIdProof")){out.print("Photo Id proof must be selected."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>Photo ID Proof No. :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <input type=\"text\" name=\"cphotoproofno\" id=\"cphotoproofno\" onblur=\"customerphotoproofno(this.value)\"/>\n");
      out.write("        <p id=\"cphotoproofno_msg\">");
if(request.getAttribute("photoIdNo")!=null && request.getAttribute("photoIdNo").toString().equals("photoIdNo")){out.print("Photo Id number must be filled."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    <label>\n");
      out.write("        <span>Address Proof :<sup><font color=\"red\">*</font></sup></span>\n");
      out.write("        <select name=\"caddressproof\" onblur=\"customeraddressproof(this.value)\">\n");
      out.write("        <option value=\"default\" selected>--Select--</option>\n");
      out.write("        <option value=\"passport\">Passport</option>\n");
      out.write("        <option value=\"voterid\">Voter ID Card</option>\n");
      out.write("        <option value=\"drivinglicence\">Driving License</option>\n");
      out.write("        <option value=\"electricitybill\">Electricity Bill</option>\n");
      out.write("        <option value=\"bankpassbook\">Bank Passbook</option>\n");
      out.write("        </select><p id=\"caddressproof_msg\">");
if(request.getAttribute("addressProof")!=null  && request.getAttribute("addressProof").toString().equals("addressProof")){out.print("Address Proof must be selected."); } 
      out.write("</p>\n");
      out.write("    </label>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("   <center>\n");
      out.write("        <span>&nbsp;</span> \n");
      out.write("       <input type=\"submit\"  value=\"Add\" /><input type=\"reset\"  value=\"Reset\" />  \n");
      out.write("   </center>\n");
      out.write("    <br>\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"addCustomer\"/>\n");
      out.write("    <i><sup><font color=\"red\">*</font></sup> fields are mandatory.</i>\n");
      out.write("</form>\n");
      out.write("</div>\n");
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