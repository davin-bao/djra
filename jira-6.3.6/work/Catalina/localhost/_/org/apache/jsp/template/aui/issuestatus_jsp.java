/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2016-07-19 00:44:48 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.aui;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class issuestatus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1467871584000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.release();
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      if (_jspx_meth_ui_005fsoy_005f0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_ui_005fsoy_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ui:soy
    com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f0 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
    _jspx_th_ui_005fsoy_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fsoy_005f0.setParent(null);
    // /template/aui/issuestatus.jsp(1,40) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f0.setModuleKey("'jira.webresources:issue-statuses'");
    // /template/aui/issuestatus.jsp(1,40) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f0.setTemplate("'JIRA.Template.Util.Issue.Status.issueStatusResolver'");
    int _jspx_eval_ui_005fsoy_005f0 = _jspx_th_ui_005fsoy_005f0.doStartTag();
    if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fsoy_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fsoy_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_ui_005fparam_005f0(_jspx_th_ui_005fsoy_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_ui_005fparam_005f1(_jspx_th_ui_005fsoy_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_ui_005fparam_005f2(_jspx_th_ui_005fsoy_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_ui_005fparam_005f3(_jspx_th_ui_005fsoy_005f0, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_ui_005fsoy_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fsoy_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f0);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f0 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
    // /template/aui/issuestatus.jsp(2,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f0.setName("'issueStatus'");
    // /template/aui/issuestatus.jsp(2,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f0.setValue("./parameters['issueStatus']/simpleStatus");
    int _jspx_eval_ui_005fparam_005f0 = _jspx_th_ui_005fparam_005f0.doStartTag();
    if (_jspx_th_ui_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f1 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
    // /template/aui/issuestatus.jsp(3,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f1.setName("'isSubtle'");
    // /template/aui/issuestatus.jsp(3,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f1.setValue("./parameters['isSubtle']");
    int _jspx_eval_ui_005fparam_005f1 = _jspx_th_ui_005fparam_005f1.doStartTag();
    if (_jspx_th_ui_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f2 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
    // /template/aui/issuestatus.jsp(4,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f2.setName("'isCompact'");
    // /template/aui/issuestatus.jsp(4,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f2.setValue("./parameters['isCompact']");
    int _jspx_eval_ui_005fparam_005f2 = _jspx_th_ui_005fparam_005f2.doStartTag();
    if (_jspx_th_ui_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f3 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
    // /template/aui/issuestatus.jsp(5,4) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f3.setName("'maxWidth'");
    // /template/aui/issuestatus.jsp(5,4) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f3.setValue("./parameters['maxWidth']");
    int _jspx_eval_ui_005fparam_005f3 = _jspx_th_ui_005fparam_005f3.doStartTag();
    if (_jspx_th_ui_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fvalue_005fname_005fnobody.reuse(_jspx_th_ui_005fparam_005f3);
    return false;
  }
}
