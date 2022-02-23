node {
	stage("Build VPC"){
        build 'VPCDeployer'
	}
	stage("Build RDS"){
		build 'RDSDeployer'
	}
	stage("Build AMI"){
		build 'Packer Builder'
	}
    stage("Build Instance"){
		build 'EC2Deployer'
	}
	stage("Send Notification"){
			echo "Hello"
    }
	stage("Send Email"){
		echo "Hello"
    }
}
