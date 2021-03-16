properties(
	[parameters(
		[choice(choices: 
			[
                'v0.1', 
                'v0.2', 
                'v0.3', 
                'v0.4', 
                'v0.5'
            ], 
		description: 'Which Environment should we deploy?', 
		name: 'ENVIRONMENT')])]
)
node {
	stage("Stage1"){
		git "https://github.com/farrukh90/jenkins-class.git"
}
	stage("Stage2"){
		echo "hello"
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
