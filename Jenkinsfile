pipeline {
	agent any
	stages {
		stage("buid") {
			steps {
				echo "building..."
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

