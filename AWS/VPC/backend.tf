terraform {
  backend "s3" {
    bucket = "pushbutton-yigithan"
    key    = "us/app/pushbutton/vpc"
    region = "us-east-1"
  }
}