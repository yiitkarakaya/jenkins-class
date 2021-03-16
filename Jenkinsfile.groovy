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
		git url: "https://github.com/farrukh90/infrastructure.git"
}
	stage("Stage2"){
        workspace("infrastructure"){
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
pi


