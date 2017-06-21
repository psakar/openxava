if (attachmentsEditor == null) var attachmentsEditor = {};

attachmentsEditor.upload = function(application, module, chunk, file, attachmentsId) {	
	var progressBar = attachmentsEditor.getProgressBar(file);
	$('#xava_attachments_' + attachmentsId).append(progressBar);
	
	Attachments.uploadData(application, module, file.name, file.size, file.type, attachmentsId, 
	  function(attachmentId) {
		attachmentsEditor.uploadContent(application, module, chunk, file, attachmentId, 
		  function() {
			Attachments.commit(application, module, attachmentId, 
			  function() {
				progressBar.remove();
				attachmentsEditor.addAttachmentToHolder({'id': attachmentId, 
														 'name': file.name,
										                 'size': file.size, 
										                 'type': file.type}, attachmentsId);
			});
		});  	
	});	
}

attachmentsEditor.uploadContent = function(application, module, chunk, file, attachmentId, callback) {
	var reader = new FileReader();
	var readBlob = null;
	
	var size = file.size;	
	var offset = -1 * chunk;
	
	reader.onloadstart = function(event) {
		if (offset > 0) return;
		console.log('initiating_uploadContent:' + file.name + '-' + size);		
	};	    
    
	reader.onload = function(event) {
		if (event.target.error != null) {
			console.log('error_uploadContent:' + file.name);
			return;
		}
		
		var data = new Int8Array(event.target.result);		
		Attachments.uploadContent(application, module, attachmentId, Array.prototype.slice.call(data), readBlob);			
	};
	
	readBlob = function() {
		if ((offset += chunk) < size) {
			var blob = file.slice(offset, offset + chunk);
			reader.readAsArrayBuffer(blob);
		} else {
			console.log('ending_uploadContent:' + file.name + '-' + offset);
			callback();
		}		
	}
	readBlob();
}

attachmentsEditor.getProgressBar = function(file) {	
	var progressBar = $('<div/>');
	progressBar.addClass('ox-attachment-loader');
	
	var span = $('<span/>');	
	span.append(file.name + '&nbsp;')
	span.append(progressBar);
	span.append('&nbsp;&nbsp;');
	return span;
}

attachmentsEditor.addAttachmentToHolder = function(attachment, holderId) {
	var holder = $('#xava_attachments_' + holderId);
	var template = holder.children().first().clone();
	template.attr('style', '');
	template.attr('href', template.attr('href') + attachment.id);
	template.attr('data-attachment', attachment.name + ':' + attachment.size + 'B:' + attachment.type);
	template.html(attachment.name);			
	holder.append(template).append('&nbsp;&nbsp;');
}

attachmentsEditor.removeAttachment = function(application, module, element, attachmentId) {
	$(element).parent().prev().remove();
	$(element).parent().remove();	
	openxava.executeAction(application, module, "", false, "Attachments.remove", "attachmentId=" + attachmentId);
}