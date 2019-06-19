document.getElementById("submit").onclick = openMail;
function openMail() {
	var firstName = document.getElementById("first_name").value;
	var subject = document.getElementById("sub").value;
	var email = document.getElementById("email").value;
	var message = document.getElementById("textarea1").value;
	var emailMessage = '%20Please reply to: ' + email;
	var completeMessage = message +  emailMessage;
	var mailLink = document.createElement("a");
	mailLink.href = "mailto:assafgruengard@gmail.com?subject=" + subject + "&body=" + completeMessage;
	mailLink.click();
}