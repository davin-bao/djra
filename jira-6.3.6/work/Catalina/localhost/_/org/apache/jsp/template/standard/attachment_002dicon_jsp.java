/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2016-09-07 09:03:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.standard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class attachment_002dicon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1467871584000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005felse;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005felse.release();
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

      out.write('\n');
      //  ww:property
      webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f0 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue.get(webwork.view.taglib.PropertyTag.class);
      _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ww_005fproperty_005f0.setParent(null);
      // /template/standard/attachment-icon.jsp(2,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ww_005fproperty_005f0.setValue("/componentManager/fileIconBean/fileIcon(parameters['filename'], parameters['mimetype'])");
      int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
      if (_jspx_eval_ww_005fproperty_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_ww_005fproperty_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_ww_005fproperty_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_ww_005fproperty_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("    ");
          //  ww:if
          webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f0 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
          _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
          _jspx_th_ww_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fproperty_005f0);
          // /template/standard/attachment-icon.jsp(3,4) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_ww_005fif_005f0.setTest(". != null");
          int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
          if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("        <img src=\"");
              out.print( request.getContextPath() );
              out.write("/images/icons/attach/");
              if (_jspx_meth_ww_005fproperty_005f1(_jspx_th_ww_005fif_005f0, _jspx_page_context))
                return;
              out.write("\" height=\"16\" width=\"16\"\n");
              out.write("             border=\"0\" alt=\"");
              if (_jspx_meth_ww_005fproperty_005f2(_jspx_th_ww_005fif_005f0, _jspx_page_context))
                return;
              out.write("\">        \n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_ww_005fif_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_ww_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
          out.write("\n");
          out.write("    ");
          //  ww:else
          webwork.view.taglib.ElseTag _jspx_th_ww_005felse_005f0 = (webwork.view.taglib.ElseTag) _005fjspx_005ftagPool_005fww_005felse.get(webwork.view.taglib.ElseTag.class);
          _jspx_th_ww_005felse_005f0.setPageContext(_jspx_page_context);
          _jspx_th_ww_005felse_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fproperty_005f0);
          int _jspx_eval_ww_005felse_005f0 = _jspx_th_ww_005felse_005f0.doStartTag();
          if (_jspx_eval_ww_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("        <img src=\"");
              out.print( request.getContextPath() );
              out.write("/images/icons/attach/file.gif\" height=\"16\" width=\"16\" border=\"0\" alt=\"File\">\n");
              out.write("    ");
              int evalDoAfterBody = _jspx_th_ww_005felse_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_ww_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fww_005felse.reuse(_jspx_th_ww_005felse_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fww_005felse.reuse(_jspx_th_ww_005felse_005f0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_ww_005fproperty_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_ww_005fproperty_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue.reuse(_jspx_th_ww_005fproperty_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue.reuse(_jspx_th_ww_005fproperty_005f0);
      out.write('\n');
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

  private boolean _jspx_meth_ww_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f1 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /template/standard/attachment-icon.jsp(4,70) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("icon");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f2 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /template/standard/attachment-icon.jsp(5,29) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("altText");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }
}
