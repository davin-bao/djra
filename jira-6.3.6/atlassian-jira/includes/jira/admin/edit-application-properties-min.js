var _gaq=_gaq||[];(function($,AJS,Backbone){var GravatarSettingsView=Backbone.View.extend({events:{"click input[name=useGravatar]:checked":"_onUseGravatarClicked"},initialize:function(options){Backbone.View.prototype.initialize.call(this,arguments);this._gravatarServer=this.$el.find(".gravatar-server")},_onUseGravatarClicked:function(e){var gravatarOn=this.$(e.target).val()==="true";this._gravatarServer.toggleClass("hidden",!gravatarOn)}});AJS.toInit(function(){$("#edit-application-properties").each(function(){new GravatarSettingsView({el:this})})})})(AJS.$,AJS,Backbone);