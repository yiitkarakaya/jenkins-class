node {
    stage("Stage1"){
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/infrastructure.git']]])
    }
    stage("Stage2"){
        ws("inf/vpc"){
            sh "terraform plan"
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
