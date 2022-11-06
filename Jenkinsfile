pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean package'
				echo 'Building/Testing/Deploying  the PetClinic project with Maven'
				}
			}	
	 }
}

