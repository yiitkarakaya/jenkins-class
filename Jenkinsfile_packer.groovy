node {
	stage("Packer Validate"){
		ws("${workspace}/packer/pipelines/tools"){
			sh "packer validate golden_image.json"
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
