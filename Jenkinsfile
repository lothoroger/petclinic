pipeline {
	agent any
	
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean package'
				echo 'Building/Test/Deploy  the PetClinic project with Maven'
				}
			}
			
	 }
}

