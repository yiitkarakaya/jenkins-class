node {
	stage("Stage1"){
		ws("${workspace}/packer/pipelines/tools"){
			sh "pwd"
		}
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
