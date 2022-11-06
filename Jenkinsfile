pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn build'
				echo 'Building  the PetClinic project with Maven'
				}
			}
		stage('Test') {
			steps {
				sh 'mvn test'
				echo 'Test the PetClinic project with Maven'
				}
			}	
		stage('Deploy') {
			steps {
				sh 'mvn package'
				echo 'Deploy  the PetClinic project with Maven'
				}
			}
		
	 }
}

