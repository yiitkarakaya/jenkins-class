data "aws_ami" "example" {
  executable_users = ["self"]
  most_recent      = true
  name_regex       = "packer-centos7*"
  owners           = ["self"]

  filter {
    name   = "root-device-type"
    values = ["ebs"]
  }

  filter {
    name   = "virtualization-type"
    values = ["hvm"]
  }
}

module "ec2_cluster" {
  source                 = "terraform-aws-modules/ec2-instance/aws"
  version                = "~> 2.0"

  name                   = "my-cluster"
  instance_count         = 1

  ami                    = data.aws_ami.example.id
  instance_type          = "t2.micro"
  key_name               = "user1"
  monitoring             = true
}