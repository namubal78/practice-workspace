/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2023-03-09 12:42:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/namubal78_workspaces/practice-workspace/Practice/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1678365260394L));
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/6cda7ccd12.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("    div {\r\n");
      out.write("        /* border : 1px solid #78C2AD; */\r\n");
      out.write("        box-sizing : border-box;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* 전체를 감싸는 wrap */\r\n");
      out.write("    .wrap {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: auto;\r\n");
      out.write("        margin : auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .wrap>div { width : 100%; }\r\n");
      out.write("\r\n");
      out.write("    #navigator2 { height: 100px; }\r\n");
      out.write("\r\n");
      out.write("    #content { height: auto; display: flex; }\r\n");
      out.write("    #content_2>div { width: 100%; float: left; }\r\n");
      out.write("    #content_2_1 { height: 115px; }\r\n");
      out.write("    #content_2_2 { height: auto; }\r\n");
      out.write("\r\n");
      out.write("    #header { height: 130px; }\r\n");
      out.write("\r\n");
      out.write("    #content_2_1>p {\r\n");
      out.write("        font-size: 35px;\r\n");
      out.write("        color: rgb(0, 0, 0);\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("        margin-left: 30px;\r\n");
      out.write("        text-align : center;\r\n");
      out.write("        font-weight: bold;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /* content 영역 */\r\n");
      out.write("    #content>div { height : 100%; float : left; }\r\n");
      out.write("    #content_1 { width : 20%; }\r\n");
      out.write("    #content_2 { width : 60%; }\r\n");
      out.write("    #content_3 { width : 20%; }\r\n");
      out.write("\r\n");
      out.write("    body { font-family: 'Noto Sans KR', sans-serif !important; }\r\n");
      out.write("\r\n");
      out.write("    /* 여기부터는 내가 준 스타일 영역 */\r\n");
      out.write("    #memberEnrollFrom {\r\n");
      out.write("        box-sizing: border-box;\r\n");
      out.write("        height: 700px;\r\n");
      out.write("        width: 500px;\r\n");
      out.write("        margin-top: 50px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("    #memberEnrollForm tr { height: 40px!important; }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("            <div id=\"content_1\"></div>\r\n");
      out.write("            <div id=\"content_2\">\r\n");
      out.write("                <div id=\"content_2_1\">\r\n");
      out.write("                    <p>회원가입</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"content_2_2\">\r\n");
      out.write("                    <form action=\"insert.me\" method=\"post\" id=\"enrollForm\" onsubmit=\"return enrollForm_check()\">\r\n");
      out.write("                        <table id=\"memberEnrollForm\" align=\"center\" >\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th align=\"left\" colspan=\"3\">아이디</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr style=\"display: inline-block;\">\r\n");
      out.write("                                <td colspan=\"3\">\r\n");
      out.write("                                    <input class=\"form-control\" type=\"text\" placeholder=\"아이디를 입력해주세요\" style=\"width: 200px;\" required name=\"memberId\" id=\"memberId\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary\" style=\"width:100px\" name=\"idCheck\" id=\"idCheckbtn\">중복확인</button>\r\n");
      out.write("                                </td>\r\n");
      out.write("							<tr style=\"height: 20px!important;\">\r\n");
      out.write("								 <td>\r\n");
      out.write("                                	<div id=\"checkResult\" style=\"font-size:0.8em; display:none; padding-left: 6px;\"></div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                    \r\n");
      out.write("							</tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th align=\"left\" colspan=\"3\">비밀번호</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"3\">\r\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" placeholder=\"비밀번호를 입력해주세요\" style=\"width:300px\" required name=\"memberPwd\" id=\"memberPwd\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th align=\"left\" colspan=\"3\">이름</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td colspan=\"3\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"이름을 입력해주세요\" style=\"width: 300px;\" required name=\"memberName\" id=\"memberName\">\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                          \r\n");
      out.write("                        </table>\r\n");
      out.write("    \r\n");
      out.write("                        <div align=\"center\" style=\"padding: 15px 0px; margin-top: 30px;\">\r\n");
      out.write("                            <button class=\"btn btn-secondary\" id=\"enrollbtn\" type=\"submit\" style=\"width: 140px; height: 40px;\" disabled onclick=\"return validate();\">가입하기</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("   	$(function() {\r\n");
      out.write("   		// 아이디를 입력받는 input 요소 객체를 변수에 담아두기 => keyup 이벤트 걸기\r\n");
      out.write("   		var $idInput = $(\"#enrollForm input[name=memberId]\");\r\n");
      out.write("   		\r\n");
      out.write("   		$idInput.keyup(function() {\r\n");
      out.write("   			\r\n");
      out.write("   			$(\"#idCheckbtn\").on(\"click\", function() {\r\n");
      out.write("   			\r\n");
      out.write("   			// 우선 최소 5글자 이상으로 아이디값이 입력되어 있을 때만 ajax 요청\r\n");
      out.write("   			// => 쿼리문의 갯수가 한정되어있을 수 있기 때문\r\n");
      out.write("   			if($idInput.val().length >= 5) {\r\n");
      out.write("   				\r\n");
      out.write("   				// ajax 를 요청하여 중복체크\r\n");
      out.write("   				$.ajax({\r\n");
      out.write("   					url : \"idCheck.me\",\r\n");
      out.write("   					data : {checkId : $idInput.val()},\r\n");
      out.write("   					success : function(result) {\r\n");
      out.write("   						\r\n");
      out.write("   						// console.log(result);\r\n");
      out.write("   						\r\n");
      out.write("   						if(result == \"NNNNN\") { // 사용 불가능\r\n");
      out.write("   							\r\n");
      out.write("   							// 빨간색 메세지 출력\r\n");
      out.write("   							$(\"#checkResult\").show();\r\n");
      out.write("   							$(\"#checkResult\").css(\"color\", \"red\").text(\"사용할 수 없는 아이디입니다.\");\r\n");
      out.write("   							\r\n");
      out.write("   							// 버튼 비활성화\r\n");
      out.write("   							$(\"#enrollForm button[type=submit]\").attr(\"disabled\", true);\r\n");
      out.write("   							\r\n");
      out.write("   						} else { // 사용 가능\r\n");
      out.write("   							\r\n");
      out.write("   							// 초록색 메세지 출력\r\n");
      out.write("   							$(\"#checkResult\").show();\r\n");
      out.write("   							$(\"#checkResult\").css(\"color\", \"green\").text(\"사용하실 수 있는 아이디입니다.\");\r\n");
      out.write("   							\r\n");
      out.write("   							// 버튼 활성화\r\n");
      out.write("   							$(\"#enrollForm button[type=submit]\").attr(\"disabled\", false);\r\n");
      out.write("   						}\r\n");
      out.write("   					},\r\n");
      out.write("   					error : function() {\r\n");
      out.write("   						console.log(\"아이디 중복 체크용 ajax 통신 실패!\");\r\n");
      out.write("   					}\r\n");
      out.write("   				});\r\n");
      out.write("   			} else { // 5글자 미만일 때 => 버튼 비활성화, 메세지 내용 숨기기\r\n");
      out.write("   				\r\n");
      out.write("   				$(\"#checkResult\").show();\r\n");
      out.write("   				$(\"#checkResult\").css(\"color\", \"red\").text(\"5자 이상으로 입력해주세요.\");\r\n");
      out.write("   				$(\"#enrollForm button[type=submit]\").attr(\"disabled\", true);\r\n");
      out.write("			}\r\n");
      out.write("   			\r\n");
      out.write("   			});\r\n");
      out.write("   		});\r\n");
      out.write("   	});\r\n");
      out.write("   </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
