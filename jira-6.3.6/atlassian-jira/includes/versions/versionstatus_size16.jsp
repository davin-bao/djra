<%@ taglib uri="webwork" prefix="ww" %>
<ww:if test="./released == true && ./archived == false">
    <img src="<%= request.getContextPath() %>/images/icons/package_16.gif" height="16" width="16" border="0" align="middle" title="<ww:text name="'common.filters.versionstatus.released'" />" alt="<ww:text name="'common.filters.versionstatus.released'" />" style="float:left; padding-right:3px;">
</ww:if>
<ww:elseIf test="./released == true && ./archived == true">
    <img src="<%= request.getContextPath() %>/images/icons/package_fade_16.gif" height="16" width="16" border="0" align="middle" title="<ww:text name="'common.filters.versionstatus.released.and.archived'" />" alt="<ww:text name="'common.filters.versionstatus.released.and.archived'" />" style="float:left; padding-right:3px;">
</ww:elseIf>
<ww:elseIf test="./released == false && ./archived == false">
    <img src="<%= request.getContextPath() %>/images/icons/box_16.gif" height="16" width="16" border="0" align="middle" title="<ww:text name="'common.filters.versionstatus.unreleased'" />" alt="<ww:text name="'common.filters.versionstatus.unreleased'" />" style="float:left; padding-right:3px;">
</ww:elseIf>
<ww:elseIf test="./released == false && ./archived == true">
    <img src="<%= request.getContextPath() %>/images/icons/box_fade_16.gif" height="16" width="16" border="0" align="middle" title="<ww:text name="'common.filters.versionstatus.unreleased.and.archived'" />" alt="<ww:text name="'common.filters.versionstatus.unreleased.and.archived'" />" style="float:left; padding-right:3px;">
</ww:elseIf>
