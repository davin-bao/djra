/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.55
 * Generated at: 2016-07-10 02:54:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.atlassian.plugin.webresource.WebResourceManager;
import com.opensymphony.util.TextUtils;
import com.atlassian.jira.security.JiraAuthenticationContext;
import com.atlassian.jira.util.I18nHelper;
import org.apache.commons.httpclient.HttpStatus;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.web.util.ProductVersionDataBeanProvider;
import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.plugin.navigation.HeaderFooterRendering;

public final class displayError_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1467871584000L));
    _jspx_dependants.put("/includes/decorators/aui-layout/head-resources.jsp", Long.valueOf(1467871638000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fparam_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.release();
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");

    // include the relevant contexts
    WebResourceManager webResourceManager = ComponentAccessor.getComponent(WebResourceManager.class);
    webResourceManager.requireResourcesForContext("atl.general");
    webResourceManager.requireResourcesForContext("jira.general");
    webResourceManager.requireResourcesForContext("atl.global");
    webResourceManager.requireResourcesForContext("jira.global");

    // figure out the status code
    Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
    String statusText = HttpStatus.getStatusText(statusCode);

    I18nHelper i18nBean = ComponentAccessor.getComponent(JiraAuthenticationContext.class).getI18nHelper();


      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>");
      out.print(TextUtils.htmlEncode(statusText));
      out.write(' ');
      out.write('(');
      out.print(statusCode);
      out.write(")</title>\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--[if IE]><![endif]-->");
      out.write("\n");
      out.write("<script type=\"text/javascript\">var contextPath = '");
      out.print(request.getContextPath());
      out.write("';</script>\n");

    //
    // IDEA gives you a warning below because it cant resolve JspWriter.  I don't know why but its harmless
    //
    HeaderFooterRendering headerAndFooter = ComponentAccessor.getComponent(HeaderFooterRendering.class);

    headerAndFooter.includeHeadResources(out);

      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.print(headerAndFooter.getKeyboardShortCutScript(request) );
      out.write("\"></script>\n");

    headerAndFooter.includeWebPanels(out, "atl.header.after.scripts");

      out.write('\n');
      out.write("\n");
      out.write("    ");
      out.print( ComponentAccessor.getComponent(ProductVersionDataBeanProvider.class).get().getMetaTags() );
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"jira\" class=\"aui-layout aui-style-default page-type-message\"  ");
      out.print( ComponentAccessor.getComponent(ProductVersionDataBeanProvider.class).get().getBodyHtmlAttributes() );
      out.write(" >\n");
      out.write("    ");
      //  ui:soy
      com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f0 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
      _jspx_th_ui_005fsoy_005f0.setPageContext(_jspx_page_context);
      _jspx_th_ui_005fsoy_005f0.setParent(null);
      // /displayError.jsp(31,4) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ui_005fsoy_005f0.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
      // /displayError.jsp(31,4) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_ui_005fsoy_005f0.setTemplate("'aui.page.pagePanel'");
      int _jspx_eval_ui_005fsoy_005f0 = _jspx_th_ui_005fsoy_005f0.doStartTag();
      if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_ui_005fsoy_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_ui_005fsoy_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("        ");
          //  ui:param
          webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f0 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
          _jspx_th_ui_005fparam_005f0.setPageContext(_jspx_page_context);
          _jspx_th_ui_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
          // /displayError.jsp(32,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_ui_005fparam_005f0.setName("'content'");
          int _jspx_eval_ui_005fparam_005f0 = _jspx_th_ui_005fparam_005f0.doStartTag();
          if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_ui_005fparam_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_ui_005fparam_005f0.doInitBody();
            }
            do {
              out.write("\n");
              out.write("            ");
              //  ui:soy
              com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f1 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
              _jspx_th_ui_005fsoy_005f1.setPageContext(_jspx_page_context);
              _jspx_th_ui_005fsoy_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f0);
              // /displayError.jsp(33,12) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_ui_005fsoy_005f1.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
              // /displayError.jsp(33,12) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_ui_005fsoy_005f1.setTemplate("'aui.page.pagePanelContent'");
              int _jspx_eval_ui_005fsoy_005f1 = _jspx_th_ui_005fsoy_005f1.doStartTag();
              if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.pushBody();
                  _jspx_th_ui_005fsoy_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                  _jspx_th_ui_005fsoy_005f1.doInitBody();
                }
                do {
                  out.write("\n");
                  out.write("                ");
                  //  ui:param
                  webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f1 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
                  _jspx_th_ui_005fparam_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_ui_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f1);
                  // /displayError.jsp(34,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_ui_005fparam_005f1.setName("'content'");
                  int _jspx_eval_ui_005fparam_005f1 = _jspx_th_ui_005fparam_005f1.doStartTag();
                  if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                    if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.pushBody();
                      _jspx_th_ui_005fparam_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                      _jspx_th_ui_005fparam_005f1.doInitBody();
                    }
                    do {
                      out.write("\n");
                      out.write("                    ");
                      //  ui:soy
                      com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f2 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
                      _jspx_th_ui_005fsoy_005f2.setPageContext(_jspx_page_context);
                      _jspx_th_ui_005fsoy_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f1);
                      // /displayError.jsp(35,20) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_ui_005fsoy_005f2.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
                      // /displayError.jsp(35,20) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_ui_005fsoy_005f2.setTemplate("'aui.page.pageHeader'");
                      int _jspx_eval_ui_005fsoy_005f2 = _jspx_th_ui_005fsoy_005f2.doStartTag();
                      if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_ui_005fsoy_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_ui_005fsoy_005f2.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("                        ");
                          //  ui:param
                          webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f2 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
                          _jspx_th_ui_005fparam_005f2.setPageContext(_jspx_page_context);
                          _jspx_th_ui_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f2);
                          // /displayError.jsp(36,24) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_ui_005fparam_005f2.setName("'content'");
                          int _jspx_eval_ui_005fparam_005f2 = _jspx_th_ui_005fparam_005f2.doStartTag();
                          if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_ui_005fparam_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_ui_005fparam_005f2.doInitBody();
                            }
                            do {
                              out.write("\n");
                              out.write("                            ");
                              //  ui:soy
                              com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f3 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
                              _jspx_th_ui_005fsoy_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_ui_005fsoy_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f2);
                              // /displayError.jsp(37,28) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_ui_005fsoy_005f3.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
                              // /displayError.jsp(37,28) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_ui_005fsoy_005f3.setTemplate("'aui.page.pageHeaderMain'");
                              int _jspx_eval_ui_005fsoy_005f3 = _jspx_th_ui_005fsoy_005f3.doStartTag();
                              if (_jspx_eval_ui_005fsoy_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_ui_005fsoy_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_ui_005fsoy_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_ui_005fsoy_005f3.doInitBody();
                              }
                              do {
                              out.write("\n");
                              out.write("                                ");
                              //  ui:param
                              webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f3 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
                              _jspx_th_ui_005fparam_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_ui_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f3);
                              // /displayError.jsp(38,32) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_ui_005fparam_005f3.setName("'content'");
                              int _jspx_eval_ui_005fparam_005f3 = _jspx_th_ui_005fparam_005f3.doStartTag();
                              if (_jspx_eval_ui_005fparam_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              if (_jspx_eval_ui_005fparam_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_ui_005fparam_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_ui_005fparam_005f3.doInitBody();
                              }
                              do {
                              out.write("\n");
                              out.write("                                    <h1>");
                              out.print(TextUtils.htmlEncode(statusText));
                              out.write(' ');
                              out.write('(');
                              out.print(statusCode);
                              out.write(")</h1>\n");
                              out.write("                                ");
                              int evalDoAfterBody = _jspx_th_ui_005fparam_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_ui_005fparam_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_ui_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f3);
                              out.write("\n");
                              out.write("                            ");
                              int evalDoAfterBody = _jspx_th_ui_005fsoy_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              if (_jspx_eval_ui_005fsoy_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                              }
                              }
                              if (_jspx_th_ui_005fsoy_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f3);
                              out.write("\n");
                              out.write("                        ");
                              int evalDoAfterBody = _jspx_th_ui_005fparam_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_ui_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f2);
                            return;
                          }
                          _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f2);
                          out.write("\n");
                          out.write("                    ");
                          int evalDoAfterBody = _jspx_th_ui_005fsoy_005f2.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_ui_005fsoy_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f2);
                        return;
                      }
                      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f2);
                      out.write("\n");
                      out.write("                    ");
                      //  ui:soy
                      com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f4 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
                      _jspx_th_ui_005fsoy_005f4.setPageContext(_jspx_page_context);
                      _jspx_th_ui_005fsoy_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f1);
                      // /displayError.jsp(44,20) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_ui_005fsoy_005f4.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
                      // /displayError.jsp(44,20) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                      _jspx_th_ui_005fsoy_005f4.setTemplate("'aui.message.warning'");
                      int _jspx_eval_ui_005fsoy_005f4 = _jspx_th_ui_005fsoy_005f4.doStartTag();
                      if (_jspx_eval_ui_005fsoy_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                        if (_jspx_eval_ui_005fsoy_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.pushBody();
                          _jspx_th_ui_005fsoy_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                          _jspx_th_ui_005fsoy_005f4.doInitBody();
                        }
                        do {
                          out.write("\n");
                          out.write("                        ");
                          //  ui:param
                          webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f4 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
                          _jspx_th_ui_005fparam_005f4.setPageContext(_jspx_page_context);
                          _jspx_th_ui_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f4);
                          // /displayError.jsp(45,24) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                          _jspx_th_ui_005fparam_005f4.setName("'content'");
                          int _jspx_eval_ui_005fparam_005f4 = _jspx_th_ui_005fparam_005f4.doStartTag();
                          if (_jspx_eval_ui_005fparam_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                            if (_jspx_eval_ui_005fparam_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.pushBody();
                              _jspx_th_ui_005fparam_005f4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                              _jspx_th_ui_005fparam_005f4.doInitBody();
                            }
                            do {
                              out.write("\n");
                              out.write("                            <p>");
                              out.print(i18nBean.getText("http.generic.error.message", TextUtils.htmlEncode("\"" + statusCode + " - " + statusText + "\"")));
                              out.write("</p>\n");
                              out.write("                            <p><a href=\"");
                              out.print(request.getContextPath());
                              out.write("/secure/MyJiraHome.jspa\">");
                              out.print(TextUtils.htmlEncode(i18nBean.getText("admin.keyboard.shortcut.goto.homr.desc")));
                              out.write("</a></p>\n");
                              out.write("                        ");
                              int evalDoAfterBody = _jspx_th_ui_005fparam_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                            } while (true);
                            if (_jspx_eval_ui_005fparam_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                              out = _jspx_page_context.popBody();
                            }
                          }
                          if (_jspx_th_ui_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                            _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f4);
                            return;
                          }
                          _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f4);
                          out.write("\n");
                          out.write("                    ");
                          int evalDoAfterBody = _jspx_th_ui_005fsoy_005f4.doAfterBody();
                          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                            break;
                        } while (true);
                        if (_jspx_eval_ui_005fsoy_005f4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                          out = _jspx_page_context.popBody();
                        }
                      }
                      if (_jspx_th_ui_005fsoy_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                        _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f4);
                        return;
                      }
                      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f4);
                      out.write("\n");
                      out.write("                ");
                      int evalDoAfterBody = _jspx_th_ui_005fparam_005f1.doAfterBody();
                      if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                        break;
                    } while (true);
                    if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                      out = _jspx_page_context.popBody();
                    }
                  }
                  if (_jspx_th_ui_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f1);
                    return;
                  }
                  _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f1);
                  out.write("\n");
                  out.write("            ");
                  int evalDoAfterBody = _jspx_th_ui_005fsoy_005f1.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
                if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                  out = _jspx_page_context.popBody();
                }
              }
              if (_jspx_th_ui_005fsoy_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f1);
              out.write("\n");
              out.write("        ");
              int evalDoAfterBody = _jspx_th_ui_005fparam_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_ui_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f0);
          out.write("\n");
          out.write("    ");
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
        return;
      }
      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f0);
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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