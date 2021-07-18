node {
	stage("Stage1"){
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/jenkins-class.git']]])
}
	stage("Stage2"){
		ws("AWS/VPC"){
            sh "pwd"
            // sh "ENVIRONMENT=dev   make tf-fmt  tf-init  tf-plan  tf-apply"
        }
}
	stage("Stage3"){
		echo "hello"
}
	stage("Stage4"){
		echo "hello"
}
	stage("Stage5"){
		echo "hello"
	}
}
