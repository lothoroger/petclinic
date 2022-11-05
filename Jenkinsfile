pipeline {
	agent any
	tools {
	    Maven 'maven-3.8.6'
	}
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean package'
				}
			}
		}
	}
				