pipeline {
	agent any
	tools {
	    Maven 'M3'
	}
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean package'
				}
			}
		}
	}
				