<%@ page import="com.atlassian.jira.util.BrowserUtils"%>
<%@ taglib uri="webwork" prefix="ww" %>
<p>
    <ww:if test="/hasAvailableActions == true">
        <input class="aui-button" type="submit" id="next" name="Next"
                   <ww:if test="/rootBulkEditBean/currentStep == 4">
                       value="<ww:text name="'common.forms.confirm'"/>"
                   </ww:if>
                   <ww:else>
                       value="<ww:text name="'common.forms.next'"/>"
                   </ww:else>
               accessKey="<ww:text name="'common.forms.submit.accesskey'"/>"
               title="<ww:text name="'common.forms.submit.tooltip'">
               <ww:param name="'value0'"><ww:text name="'common.forms.submit.accesskey'"/></ww:param>
                <ww:param name="'value1'"><%=BrowserUtils.getModifierKey()%></ww:param>
               </ww:text>"
        />
    </ww:if>
    <a class="aui-button aui-button-link" id="cancel" href="<ww:url value="'BulkCancelWizard.jspa'" atltoken="false" />"><ww:text name="'common.forms.cancel'"/></a>
</p>
