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
    stage("Pull"){
        checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/farrukh90/infrastructure.git']]])
    }
    stage("Initialize"){
        ws("workspace/inf/vpc"){
            sh "export ENVIRONMENT=${ENVIRONMENT}"
            sh "make i"
        }
    }
    stage("Plan"){
        ws("workspace/inf/vpc"){
            sh "export ENVIRONMENT=${ENVIRONMENT}"
            sh "make p"
        }
    }
    stage("Apply"){
         ws("workspace/inf/vpc"){
            sh "export ENVIRONMENT=${ENVIRONMENT}"
            sh "make a"
        }
    }
    stage("Stage5"){
        echo "hello"
	}
}
