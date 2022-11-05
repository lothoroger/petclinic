pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh './mvnw compile'
				echo 'Building the PetClinic project with Maven Compiler'
				}
			}
		stage('Test') {
			steps {
				sh './mvnw test'
				echo 'Testing the PetClinic project with Maven Test'
				}
			}
		stage('Deploy') {
			steps {
				sh './mvnw package'
				echo 'Deploy the PetClinic project with Maven Package'
				}
			}
			
	 }
}

