properties(
	[parameters(
		[choice(choices: 
			[
                'dev', 
                'qa', 
                'stage', 
                'prod'
            ], 
		description: 'Which Environment should we deploy?', 
		name: 'ENVIRONMENT')])]
)

node {
    stage("Stage1"){
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/infrastructure.git']]])
    }
    stage("Stage2"){
        ws("workspace/inf/vpc"){
            sh "export ENVIRONMENT=${ENVIRONMENT}"
            sh "make i"
        }
    }
    stage("Stage3"){
        sh "make p"
    }
    stage("Stage4"){
        echo "hello"
    }
    stage("Stage5"){
        echo "hello"
	}
}
