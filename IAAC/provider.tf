provider "jenkins" {
	server_url = "$JENKINS_URL" 
	username = "admin" 
	password = "4a38b31657ff49229462f57b41245e67" 
	ca_cert = "" 
}


resource "jenkins_credential_ssh" "example" {
	name = "ec2-user"
	username = "ec2-user"
	privatekey = file("~/.ssh/id_rsa")
	passphrase = ""
}


resource "jenkins_folder" "packer" {
	name = "packer"
	description = "A top-level folder"
}


resource "jenkins_folder" "terraform" {
	name = "terraform"
	description = "A top-level folder"
}
