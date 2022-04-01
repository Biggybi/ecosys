pipeline {
	agent any
	stages {
		stage("buid") {
			steps {
				make re
			}
		}
		stage("test") {
			steps {
				echo "testing..."
			}
		}
		stage("deploy") {
			steps {
				echo "deploying..."
			}
		}
	}
	post {
		always {
		}
		failure {
		}
	}
}

