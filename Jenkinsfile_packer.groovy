node {
	stage("Clone a Repo"){
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/jenkins-class.git']]])
		sh "ls -la"
	}
	stage("Validate"){
		ws("${workspace}/packer/pipelines/tools"){
			sh "ls -la"
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
