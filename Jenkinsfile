pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn compile'
				echo 'Building the PetClinic project with Maven Compiler'
				}
			}
		stage('Test') {
			steps {
				sh 'mvn test'
				echo 'Testing the PetClinic project with Maven Test'
				}
			}
		stage('Deploy') {
			steps {
				sh 'mvn package'
				echo 'Deploy the PetClinic project with Maven Package'
				}
			}
			
		}
}

				