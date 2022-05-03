pipeline {
	agent any
	stages {
		stage("buid") {
			steps {
				echo "building..."
				echo "change test..."
				sh 'make re'

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
	// post {
	// 	always {
	// 	}
	// 	failure {
	// 	}
	// }
}

