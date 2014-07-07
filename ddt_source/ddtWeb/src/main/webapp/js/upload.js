$(function() {
	var uploader = new plupload.Uploader({
		runtimes : 'gears,html5,flash,silverlight,browserplus',
		browse_button : 'pickfile',
		container : 'container',
		max_file_size : '10mb',
		url : '/rollbook/upload',
		flash_swf_url : '/js/plupload/js/Moxie.swf',
		silverlight_xap_url : '/js/plupload/js/Moxie.xap',
		file_data_name : "file",
		multipart : true,
		filters : [ {
			title : "Image files",
			extensions : "xls,xlsx"
		}],
		resize : {
			width : 320,
			height : 240,
			quality : 90
		}
	});
	$('#uploadfile').click(function(e) {
		var __id = $("#id").val();
		uploader.settings.multipart_params = {channelType:__id};
		uploader.start();
		e.preventDefault();
	});
	uploader.init();
	uploader.bind('FilesAdded', function(up, files) {
		$.each(files, function(i, file) {
			$('#textfield').val(file.name);
		});

		up.refresh();
	});
	
	uploader.bind('Error', function(up, err) {
		$('#img_error').addClass("error");
		$('#img_error').html(err.message);
		up.refresh();
	});
	uploader.bind('FileUploaded', function(up, file, info) {
		var obj = $.parseJSON(info.response);
		if (obj.status == 1) {
			$("#groupId").val(obj.groupId);
			$("#userCount").val(obj.userCount);
		}
		alert(obj.result);
	});

});